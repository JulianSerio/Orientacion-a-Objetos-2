package ar.edu.unlp.objetos.oo2.ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsuarioTest {
	private Usuario user;
	
	@BeforeEach
	public void setUp() {
		user = new Usuario("Pepe");
	}
	
	@Test
	public void testTweetear() {
		//Como se testea esto si no se sabe que valores se tiene que agregar
		user.Tweetear("Hola esto es un tweet valido");
		assertEquals(1,user.getTweets().size());
		user.Tweetear("");
		assertEquals(1,user.getTweets().size());
	}
	
	@Test
	public void testRetweetear() {
		Tweet tweet = new Tweet("Tweet importante");
		user.Retweetear(tweet);
		assertEquals(1,user.getTweets().size());
	}
	
	@Test
	public void testEliminarTweets() {
		Tweet tweet = new Tweet("Tweet importante");
		user.Tweetear("Hola esto es un tweet valido1");
		user.Tweetear("Hola esto es un tweet valido2");
		user.Retweetear(tweet);
		assertEquals(3,user.getTweets().size());
		user.EliminarTweets();
		assertEquals(0,user.getTweets().size());		
	}
	
	@Test
	public void testSonIguales() {
		String igual = "Pepe";
		String distinto = "Juan";
		assertTrue(user.SonIguales(igual));
		assertFalse(user.SonIguales(distinto));
	}
}
