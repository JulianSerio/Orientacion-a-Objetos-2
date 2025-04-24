package ar.edu.unlp.objetos.oo2.Practica2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ejercicio5.Decodificador;
import ejercicio5.Novedad;
import ejercicio5.Pelicula;
import ejercicio5.Puntaje;
import ejercicio5.Similaridad;


public class DecodificadorTest {
	private Decodificador deco;
	private Pelicula thor,america,dunkirk,rambo,rocky;
	private List<Pelicula> grilla;
	
	@BeforeEach
	public void setUp() {
		grilla = new ArrayList<Pelicula>();
		thor = new Pelicula("Thor",LocalDate.of(2002, 4, 5),7);
		america = new Pelicula("Captain America",LocalDate.of(2005,4,5),5);
		dunkirk = new Pelicula("Dunkirk",LocalDate.of(2017, 4, 4),10);
		rambo = new Pelicula("Rambo",LocalDate.of(1979, 5, 1),8);
		rocky = new Pelicula("Rocky",LocalDate.of(1973, 5, 1),8);

		grilla.add(thor);grilla.add(america);grilla.add(dunkirk);grilla.add(rambo);grilla.add(rocky);
		deco = new Decodificador(new ArrayList<Pelicula>(), grilla, new Novedad());
		
		thor.agregarSimilar(america); //Thor - Capitan America y Capitan America - Thor
		rocky.agregarSimilar(rambo); //Rocky - Rambo y Rambo - Rocky
	}
	
	@Test
	public void testNovedad() {
		deco.reproducir(rambo); //Vio Rambo
		List<Pelicula> recomendacion = deco.recomendarPeliculas();
		assertTrue(deco.recomendarPeliculas().contains(dunkirk));
		assertTrue(deco.recomendarPeliculas().contains(america));
		assertFalse(deco.recomendarPeliculas().contains(rambo));

	}
	@Test
	public void testSimilaridad() {
		deco.reproducir(rambo); //Vio Rambo
		deco.setEstrategia(new Similaridad());
		List<Pelicula> recomendacion = deco.recomendarPeliculas();
		assertTrue(deco.recomendarPeliculas().contains(rocky));
		assertFalse(deco.recomendarPeliculas().contains(rambo));
	}
	
	@Test
	public void testPuntaje() {
		deco.reproducir(rambo); //Vio Rambo
		deco.setEstrategia(new Puntaje());
		List<Pelicula> recomendacion = deco.recomendarPeliculas();
		assertEquals(3,deco.recomendarPeliculas().size());
		assertTrue(deco.recomendarPeliculas().contains(dunkirk));
		assertTrue(deco.recomendarPeliculas().contains(rocky));
		assertTrue(deco.recomendarPeliculas().contains(thor));
		assertFalse(deco.recomendarPeliculas().contains(rambo));
	}
	
	
}
