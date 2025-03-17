package ar.edu.unlp.objetos.oo2.ejercicio1;

public class Tweet {
	public Tweet origen;
	public String texto;
	public Boolean retweet;
	
	Tweet(String texto){
		this.texto = texto;
	}
	
	Tweet(Tweet origen){
		this.origen = origen;
		retweet = true;
	}
	
	public boolean VerificarTweet() {
		long length = this.texto.chars().count();
		if (length >= 1 && length <= 280) return true;
		return false;
	}
}
