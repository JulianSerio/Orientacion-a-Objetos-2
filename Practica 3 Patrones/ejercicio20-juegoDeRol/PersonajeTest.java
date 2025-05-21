package ar.edu.unlp.objetos.oo2.ejercicio20_juegoDeRol;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonajeTest {
	private Personaje p1,p2;
	
	@BeforeEach
	void setUp() {
		p1 = new Personaje();
		p1.setArma(new Espada());
		p1.setArmadura(new Acero());
		p1.setHabilidad("Cuerpo a cuerpo");
		p1.setNombre("Hector");
		
		p2 = new Personaje();
		p2.setArma(new Espada());
		p2.setArmadura(new Acero());
		p2.setHabilidad("Cuerpo a cuerpo");
		p2.setNombre("Roberto");		
	}
	
	@Test
	void testPuedeParticipar() {
		assertTrue(p1.puedeParticipar());
		p1.setVida(0);
		assertFalse(p1.puedeParticipar());
	}	
	
	@Test
	void testCombate() {
		assertEquals("El Jugador 1 le quito 3 de vida al Jugador 2",p1.combateContra(p2));
		assertEquals(97,p2.getVida());
		
		p2.setVida(3);
		assertEquals("El Jugador 2 murio",p1.combateContra(p2));
		assertEquals("El Jugador 2 no puede participar",p1.combateContra(p2));
		p1.setVida(0);
		assertEquals("El Jugador 1 no puede participar",p1.combateContra(p2));

	}
	
	
}
