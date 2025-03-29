package ar.edu.unlp.objetos.oo2.ejercicio2;

public class Tijera implements Jugada {

	@Override
	public String jugada(Jugada i) {
		return i.contraTijera();
	}

	@Override
	public String contraPiedra() {
		return "Gana Piedra";
	}

	@Override
	public String contraTijera() {
		return "Empate";
	}

	@Override
	public String contraPapel() {
		return "Gana Tijera";
	}

	@Override
	public String contraSpock() {
		return "Gana Spock";
	}

	@Override
	public String contraLagato() {
		return "Gana Tijera";
	}

}
