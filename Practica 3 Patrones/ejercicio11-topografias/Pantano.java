package ar.edu.unlp.objetos.oo2.ejercicio11_topografias;

public class Pantano implements Topografia{

	@Override
	public double proporcionAgua() {
		return 0.7;
	}

	@Override
	public double proporcionTierra() {
		return 0.3 ;
	}
	
	@Override
	public boolean equals(Object obj) {
	    return obj != null && this.getClass() == obj.getClass();
	}

	@Override
	public int hashCode() {
	    return this.getClass().hashCode();
	}
}
