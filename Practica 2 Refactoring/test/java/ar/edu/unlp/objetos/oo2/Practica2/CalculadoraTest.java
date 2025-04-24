package ar.edu.unlp.objetos.oo2.Practica2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ejercicio7.Calculadora;

public class CalculadoraTest {
	private Calculadora calc;

	@BeforeEach
	public void setUp() {
		calc = new Calculadora();
	}
	
	@Test
	public void testFuncionamiento() {
		calc.setValue(5); // Establece el valor inicial
		calc.mas(); // Prepara para sumar
		calc.setValue(3); // Suma 3 al valor acumulado
		assertEquals("8.0",calc.resultado());
		assertEquals(calc.resultado(),"8.0");
		calc.por();
		calc.setValue(2);
		assertEquals("16.0",calc.resultado());
	}
	
	@Test
	public void testSuma() {
		calc.setValue(5);
		calc.mas(); 
		calc.setValue(3); 
		assertEquals("8.0",calc.resultado());
	}
	
	@Test
	public void testDivision() {
		calc.setValue(10);
		calc.dividido();
		calc.setValue(0);
		assertEquals("Error",calc.resultado());
		calc.borrar();
		calc.setValue(10);
		calc.dividido();
		calc.setValue(2);
		assertEquals("5.0",calc.resultado());
	}
	
	@Test
	public void testMultiplicacion() {
		calc.setValue(2);
		calc.por();
		calc.setValue(5);
		assertEquals("10.0",calc.resultado());
	}
	
	@Test
	public void testResta() {
		calc.setValue(2);
		calc.menos();
		calc.setValue(4);
		assertEquals("-2.0",calc.resultado());
	}
	
	@Test
	public void testBorrado() {
		calc.mas();
		calc.menos();
		assertEquals("Error",calc.resultado());
		calc.dividido();
		assertEquals("Error",calc.resultado());
		calc.mas();
		assertEquals("Error",calc.resultado());
		calc.por();
		assertEquals("Error",calc.resultado());
		calc.borrar();
		calc.setValue(2);
		assertEquals("2.0",calc.resultado());
	}
	
}
