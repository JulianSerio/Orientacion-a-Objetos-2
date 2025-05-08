package ar.edu.unlp.objetos.oo2.ejercicio13_subteway;

public class Subteway {
	private SandwichBuilder builder;

	public Subteway() {
	}

	public void setBuilder(SandwichBuilder builder) {
		this.builder = builder;
	}
	
	public Sandwich construir() {
		this.builder.buildPan();
		this.builder.buildPrincipal();
		this.builder.buildAderezo();
		this.builder.buildAdicional();
		return this.builder.getResultado();
	}
	
	
	

}
