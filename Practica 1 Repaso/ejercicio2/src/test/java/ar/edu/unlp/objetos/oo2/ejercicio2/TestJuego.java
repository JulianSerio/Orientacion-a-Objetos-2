package ar.edu.unlp.objetos.oo2.ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestJuego {
	private Lagarto lagarto;
	private Spock spock;
	private Tijera tijera;
	private Papel papel;
	private Piedra piedra;
	
	@BeforeEach
	public void SetUp() {
		lagarto = new Lagarto();
		spock = new Spock();
		tijera = new Tijera();
		papel = new Papel();
		piedra = new Piedra();
	}
	
	@Test
	void testJugada() {
		assertEquals("Gana Piedra",piedra.jugada(tijera));
		assertEquals("Gana Papel",piedra.jugada(papel));
		assertEquals("Empate",piedra.jugada(piedra));
		
		assertEquals("Gana Papel",papel.jugada(piedra));
		assertEquals("Gana Tijera",papel.jugada(tijera));
		assertEquals("Empate",papel.jugada(papel));
		
		assertEquals("Gana Tijera",tijera.jugada(papel));
		assertEquals("Gana Spock",tijera.jugada(spock));
		assertEquals("Empate",tijera.jugada(tijera));
		
		assertEquals("Gana Lagarto",lagarto.jugada(papel));
		assertEquals("Gana Tijera",lagarto.jugada(tijera));
		assertEquals("Empate",lagarto.jugada(lagarto));
		
		assertEquals("Gana Spock",spock.jugada(tijera));
		assertEquals("Gana Lagarto",spock.jugada(lagarto));
		assertEquals("Empate",spock.jugada(spock));
	}

}
