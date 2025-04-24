package ar.edu.unlp.objetos.oo2.Practica2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ejercicio6.Excursion;
import ejercicio6.Usuario;

public class ExcursionTest {
	private Excursion ex;
	private Usuario user1,user2,user3;
	
	
	@BeforeEach
	public void setUp() {
		ex = new Excursion("Dos dias en Kayak bajando el Parana",LocalDate.of(2025, 5, 5),LocalDate.of(2025, 5, 7),"La Costa",5000,1,2);
		user1 = new Usuario("Juan","Campa","user1@gmail.com");
		user2 = new Usuario("Pepe","Pasto","user2@hotmail.com");
		user3 = new Usuario("Tomas","Merkel","user3@protonmail.com");
	}
	
	@Test
	public void testEstados() {
		//Provisoria
		assertEquals("Excursion nombre= Dos dias en Kayak bajando el Parana, costo= 5000.0, fechaInicio= 2025-05-05, fechaFin= 2025-05-07, puntoEncuentro= La Costa, faltan para cupo minimo= 1",ex.obtenerInformacion());
		ex.inscribir(user1);
		assertEquals("Excursion nombre= Dos dias en Kayak bajando el Parana, costo= 5000.0, fechaInicio= 2025-05-05, fechaFin= 2025-05-07, puntoEncuentro= La Costa, emails= user1@gmail.com , faltan para cupo maximo= 1",ex.obtenerInformacion());
		//Definitiva
		ex.inscribir(user2);
		//Maxima
		assertEquals("Excursion nombre= Dos dias en Kayak bajando el Parana, costo= 5000.0, fechaInicio= 2025-05-05, fechaFin= 2025-05-07, puntoEncuentro= La Costa, ",ex.obtenerInformacion());
	}
	
	@Test
	public void testAgregarEspera() {
		ex.inscribir(user1);
		ex.inscribir(user2);
		ex.inscribir(user3);
		assertTrue(ex.getEspera().contains(user3));
	}
	
	
	

}
