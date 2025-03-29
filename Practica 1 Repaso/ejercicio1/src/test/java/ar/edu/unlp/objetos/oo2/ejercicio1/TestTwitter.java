package ar.edu.unlp.objetos.oo2.ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTwitter {
	private Twitter tw;
	
	@BeforeEach
	public void setUp() {
		tw = new Twitter();
	}
	
	@Test
	public void testAgregarUsuario() {
		tw.AgregarUsuario("Pepe");
		tw.AgregarUsuario("Carlos");
		assertEquals(2,tw.getUsuarios().size());
		tw.AgregarUsuario("Pepe");
		assertEquals(2,tw.getUsuarios().size());
	}
	
	@Test
	public void testEliminarUsuario() {
		tw.AgregarUsuario("Pepe");
		tw.AgregarUsuario("Carlos");
		tw.EliminarUsuario("Carlos");
		assertEquals(1,tw.getUsuarios().size());
		tw.EliminarUsuario("Jose");
		assertEquals(1,tw.getUsuarios().size());
	}

}
