package ar.edu.unlp.objetos.oo2.ejercicio11_topografias;

public interface Topografia {
	public double proporcionAgua();
	public double proporcionTierra();
	public boolean igual(Topografia topo);
	public boolean igualAAgua();
	public boolean igualATierra();
	public boolean igualAPantano();
	public boolean igualAMixta();
	public Topografia obtenerTopografia(int i);

	
}
