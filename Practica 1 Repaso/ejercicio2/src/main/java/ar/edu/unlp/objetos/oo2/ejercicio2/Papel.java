package ar.edu.unlp.objetos.oo2.ejercicio2;

public class Papel implements Jugada{

	@Override
	public String jugada(Jugada i) {
		return i.contraPapel();
	}

	@Override
	public String contraPiedra() {
		return "Gana Papel";
	}

	@Override
	public String contraTijera() {
		return "Gana Tijera";
	}

	@Override
	public String contraPapel() {
		return "Empate";
	}

	@Override
	public String contraSpock() {
		return "Gana Papel";
	}

	@Override
	public String contraLagato() {
		return "Gana Lagarto";
	}

}
