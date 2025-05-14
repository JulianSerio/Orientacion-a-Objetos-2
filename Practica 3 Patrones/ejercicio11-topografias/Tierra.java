package ar.edu.unlp.objetos.oo2.ejercicio11_topografias;

public class Tierra implements Topografia{

	@Override
	public double proporcionAgua() {
		return 0;
	}

	@Override
	public double proporcionTierra() {
		return 1;
	}

	@Override
	public boolean igual(Topografia topo) {
		return topo.igualATierra();
	}

	@Override
	public boolean igualAAgua() {
		return false;
	}

	@Override
	public boolean igualATierra() {
		return true;
	}

	@Override
	public boolean igualAPantano() {
		return false;
	}

	@Override
	public boolean igualAMixta() {
		return false;
	}
	
	@Override
	public Topografia obtenerTopografia(int i) {
		return this;
	}

}
