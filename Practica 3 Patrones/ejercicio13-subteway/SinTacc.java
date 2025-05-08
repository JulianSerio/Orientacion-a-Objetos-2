package ar.edu.unlp.objetos.oo2.ejercicio13_subteway;

public class SinTacc implements SandwichBuilder{
	private Sandwich sandwich;
	
	public SinTacc() {
		this.sandwich = new Sandwich();
	}

	@Override
	public void buildPan() {
		this.sandwich.setPan("Pan de Chipa", 150);
	}

	@Override
	public void buildAderezo() {
		this.sandwich.setAderezo("Salsa Tartara", 18);
	}

	@Override
	public void buildAdicional() {
		this.sandwich.setAdicional("Verdura Grillada", 200);
	}

	@Override
	public Sandwich getResultado() {
		return this.sandwich;
	}

	@Override
	public void buildPrincipal() {
		this.sandwich.setPrincipal("Carne de Pollo", 250);
	}

}
