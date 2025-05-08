package ar.edu.unlp.objetos.oo2.ejercicio13_subteway;

public class Vegano implements SandwichBuilder{
	private Sandwich sandwich;
	
	public Vegano() {
		this.sandwich = new Sandwich();
	}

	@Override
	public void buildPan() {
		this.sandwich.setPan("Pan Integral", 100);
	}

	@Override
	public void buildAderezo() {
		this.sandwich.setAderezo("Salsa Criolla", 20);
		
	}

	@Override
	public void buildAdicional() {
		this.sandwich.setAdicional("Sin Adicional",0);
		
	}

	@Override
	public Sandwich getResultado() {
		return this.sandwich;
	}

	@Override
	public void buildPrincipal() {
		this.sandwich.setPrincipal("Milanesa de Girgolas", 500);
	}

}
