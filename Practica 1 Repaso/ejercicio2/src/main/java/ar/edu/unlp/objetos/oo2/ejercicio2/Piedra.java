package ar.edu.unlp.objetos.oo2.ejercicio2;

public class Piedra implements Jugada {

	@Override
	public String jugada(Jugada i) {
		return i.contraPiedra();
	}

	@Override
	public String contraPiedra() {
		return "Empate";
	}

	@Override
	public String contraTijera() {
		return "Gana Piedra";
	}

	@Override
	public String contraPapel() {
		return "Gana Papel";
	}

	@Override
	public String contraSpock() {
		return "Gana Spock";
	}

	@Override
	public String contraLagato() {
		return "Gana Piedra";
	}

}
