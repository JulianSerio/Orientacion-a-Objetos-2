package ar.edu.unlp.objetos.oo2.ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Usuario {
	private String screenName;
	private List<Tweet> tweets;
	
	public Usuario(String nombre) {
		this.screenName = nombre;
		tweets = new ArrayList<Tweet>();
	}

	public void EliminarTweets() {
		//Utilizar NULL no borraria los tweets sino que los desvincula
		if (!this.tweets.isEmpty()) this.tweets.clear();
	}
	
	public void Tweetear() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Texto del tweet: ");
		String texto = scanner.next();
		if (!texto.isBlank()) {
			Tweet tweet = new Tweet(texto);
			if (tweet.VerificarTweet()) {
				tweets.add(tweet);
			}
		}else {
			System.out.println("El Tweet esta en blanco!");
		}
	}
	
	//ALTERNATIVA AL SCANNER (ya que con el scanner es complicado probar el codigo)
	public void Tweetear(String texto) {
	    if (!texto.isBlank()) {
	        Tweet tweet = new Tweet(texto);
	        if (tweet.VerificarTweet()) {
	            tweets.add(tweet);
	        }
	    }
	}
	
	public void Retweetear(Tweet origen) {
		Tweet tweet = new Tweet(origen);
		tweets.add(tweet);
	}
	
	public boolean SonIguales (String nombreABuscar) {
		if (this.screenName.equals(nombreABuscar)) return true;
		return false;
	}
	
	public List<Tweet> getTweets(){ return this.tweets;}


}
