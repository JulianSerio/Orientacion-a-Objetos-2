package ar.edu.unlp.objetos.oo2.Practica2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ejercicio9.AutoEnAlquiler;
import ejercicio9.Estricta;
import ejercicio9.Flexible;
import ejercicio9.Moderada;
import ejercicio9.Reserva;

public class ReservaTest {
	private Reserva res;
	private AutoEnAlquiler au;

	
	@BeforeEach
	public void setUp() {
		au = new AutoEnAlquiler(100);
		au.setPoliticaCancelacion(new Flexible());
		res = new Reserva(au,LocalDate.of(2025, 4, 19),5);
	}
	
	@Test
	public void testPoliticas() {
		assertEquals(500.0,res.montoAReembolsar(LocalDate.now()));
		au.setPoliticaCancelacion(new Estricta());
		assertEquals(0.0,res.montoAReembolsar(LocalDate.now()));
		au.setPoliticaCancelacion(new Moderada());
		assertEquals(0.0,res.montoAReembolsar(LocalDate.now()));
		assertEquals(250.0,res.montoAReembolsar(LocalDate.of(2025, 4, 17)));
		assertEquals(500.0,res.montoAReembolsar(LocalDate.of(2025, 4, 12)));
		
	}
	
	

}
