package ar.edu.unlp.objetos.oo2.ejercicio20_juegoDeRol;

public abstract class Armadura {
	public int recibirDaño(Arma arma) {
		return arma.atacar(this);
	}
	public abstract int recibirEspada();
	public abstract int recibirArco();
	public abstract int recibirBaston();
}
