package ar.edu.unlp.objetos.oo2.ejercicio13_subteway;

public class Vegetariano implements SandwichBuilder{
	private Sandwich sandwich;

	public Vegetariano() {
		this.sandwich = new Sandwich();
	}
	
	@Override
	public void buildPan() {
		this.sandwich.setPan("Pan de Semillas", 120);
	}

	@Override
	public void buildAderezo() {
		this.sandwich.setAderezo("Sin Aderezo", 0);	
	}

	@Override
	public void buildAdicional() {
		this.sandwich.setAdicional("Berenjenas al Escabeche", 100);
	}

	@Override
	public Sandwich getResultado() {
		return this.sandwich;
	}

	@Override
	public void buildPrincipal() {
		this.sandwich.setPrincipal("Provoleta Grillada", 200);
	}

}
