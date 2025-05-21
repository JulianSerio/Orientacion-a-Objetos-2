package ar.edu.unlp.objetos.oo2.ejercicio20_juegoDeRol;

public class Acero extends Armadura{

	@Override
	public int recibirEspada() {
		return 3;
	}

	@Override
	public int recibirArco() {
		return 2;
	}

	@Override
	public int recibirBaston() {
		return 1;
	}

}
