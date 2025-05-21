package ar.edu.unlp.objetos.oo2.ejercicio20_juegoDeRol;

public class Espada implements Arma {

	@Override
	public int atacar(Armadura armadura) {
		return armadura.recibirEspada();
	}
	

}
