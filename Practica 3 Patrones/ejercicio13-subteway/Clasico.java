package ar.edu.unlp.objetos.oo2.ejercicio13_subteway;

public class Clasico implements SandwichBuilder{
	private Sandwich sandwich;

	public Clasico() {
		this.sandwich = new Sandwich();
	}
	
	@Override
	public void buildPan() {
		this.sandwich.setPan("Pan de Brioche", 100);
	}

	@Override
	public void buildAderezo() {
		this.sandwich.setAderezo("Base de Mayonesa", 20);
	}

	@Override
	public void buildAdicional() {
		this.sandwich.setAdicional("Tomate", 80);
	}

	@Override
	public Sandwich getResultado() {
		return this.sandwich;
	}

	@Override
	public void buildPrincipal() {
		this.sandwich.setPrincipal("Carne de Ternera", 300);
	}

}
