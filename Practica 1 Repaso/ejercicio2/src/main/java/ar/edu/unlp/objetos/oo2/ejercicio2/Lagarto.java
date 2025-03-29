package ar.edu.unlp.objetos.oo2.ejercicio2;

public class Lagarto implements Jugada{

	@Override
	public String jugada(Jugada i) {
		return i.contraLagato();
	}

	@Override
	public String contraPiedra() {
		return "Gana Piedra";
	}

	@Override
	public String contraTijera() {
		return "Gana Tijera";
	}

	@Override
	public String contraPapel() {
		return "Gana Lagarto";
	}

	@Override
	public String contraSpock() {
		return "Gana Lagarto";
	}

	@Override
	public String contraLagato() {
		return "Empate";
	}

}
