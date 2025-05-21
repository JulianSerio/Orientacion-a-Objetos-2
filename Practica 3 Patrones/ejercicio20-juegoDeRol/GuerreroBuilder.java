package ar.edu.unlp.objetos.oo2.ejercicio20_juegoDeRol;

public class GuerreroBuilder implements PersonajeBuilder{
	private Personaje guerrero;
	
	public GuerreroBuilder() {
		this.guerrero = new Personaje();
	}

	@Override
	public void buildNombre(String nombre) {
		guerrero.setNombre(nombre);
	}

	@Override
	public void buildArma() {
		guerrero.setArma(new Espada());
	}

	@Override
	public void buildArmadura() {
		guerrero.setArmadura(new Acero());
	}

	@Override
	public void buildHabilidad() {
		guerrero.setHabilidad("Cuerpo a cuerpo");
	}

	@Override
	public Personaje getResultado() {
		return this.guerrero;
	}

}
