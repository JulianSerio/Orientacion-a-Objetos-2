package ar.edu.unlp.objetos.oo2.ejercicio1;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TweetTest {
	private Tweet tweet,tweetInvalido;
	
	@BeforeEach
    void setUp() {
        tweet = new Tweet("Esto es un tweet!");
        tweetInvalido = new Tweet("");   
    }

    @Test
    void testVerificarTweet() {
    	assertTrue(tweet.VerificarTweet());
    	assertFalse(tweetInvalido.VerificarTweet());	
    }
}
