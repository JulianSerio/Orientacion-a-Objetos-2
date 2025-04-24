package ar.edu.unlp.objetos.oo2.Practica2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ejercicio2.Temporario;

public class TemporarioTest {
	private Temporario temp,tempNoCasado,tempSinHijos;

	@BeforeEach
	public void setUp() {
		temp = new Temporario(100,true,2,0);
		tempNoCasado = new Temporario(100,false,2,0);
		tempSinHijos = new Temporario(100,false,0,1);
		
	}
	
	@Test
	public void testSueldo() {
		assertEquals(8637, temp.sueldo());       
		assertEquals(3887, tempNoCasado.sueldo());
		assertEquals(348,tempSinHijos.sueldo());
	}
}
