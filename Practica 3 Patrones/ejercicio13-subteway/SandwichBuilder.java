package ar.edu.unlp.objetos.oo2.ejercicio13_subteway;

public interface SandwichBuilder {
	public void buildPan();
	public void buildAderezo();
	public void buildAdicional();
	public void buildPrincipal();
	public Sandwich getResultado();
}
