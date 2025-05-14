package ar.edu.unlp.objetos.oo2.ejercicio11_topografias;

public class Agua implements Topografia{

	@Override
	public double proporcionAgua() {
		return 1;
	}

	@Override
	public double proporcionTierra() {
		return 0;
	}

	@Override
	public boolean igual(Topografia topo) {
		return topo.igualAAgua();
	}

	@Override
	public boolean igualAAgua() {
		return true;
	}

	@Override
	public boolean igualATierra() {
		return false;
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
