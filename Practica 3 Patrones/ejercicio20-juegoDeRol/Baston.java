package ar.edu.unlp.objetos.oo2.ejercicio20_juegoDeRol;

public class Baston implements Arma{

	@Override
	public int atacar(Armadura armadura) {
		return armadura.recibirBaston();
	}

}
