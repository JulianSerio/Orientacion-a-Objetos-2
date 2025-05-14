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
	public boolean igual(Topografia topo) {
		return topo.igualAPantano();
	}

	@Override
	public boolean igualAAgua() {
		return false;
	}

	@Override
	public boolean igualATierra() {
		return false;
	}

	@Override
	public boolean igualAPantano() {
		return true;
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
