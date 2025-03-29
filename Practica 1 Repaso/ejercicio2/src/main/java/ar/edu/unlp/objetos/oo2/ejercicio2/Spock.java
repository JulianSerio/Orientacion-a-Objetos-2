package ar.edu.unlp.objetos.oo2.ejercicio2;

public class Spock implements Jugada{

	@Override
	public String jugada(Jugada i) {
		return i.contraSpock();
	}

	@Override
	public String contraPiedra() {
		return "Gana Spock";
	}

	@Override
	public String contraTijera() {
		return "Gana Spock";
	}

	@Override
	public String contraPapel() {
		return "Gana Papel";
	}

	@Override
	public String contraSpock() {
		// TODO Auto-generated method stub
		return "Empate";
	}


	@Override
	public String contraLagato() {
		// TODO Auto-generated method stub
		return "Gana Lagarto";
	}

}
