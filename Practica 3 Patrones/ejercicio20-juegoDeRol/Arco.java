package ar.edu.unlp.objetos.oo2.ejercicio20_juegoDeRol;

public class Arco implements Arma {

	@Override
	public int atacar(Armadura armadura) {
		return armadura.recibirArco();
	}

}
