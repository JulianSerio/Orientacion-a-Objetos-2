package ar.edu.unlp.objetos.oo2.ejercicio20_juegoDeRol;

public class ArqueroBuilder implements PersonajeBuilder{
	private Personaje arquero;
	
	public ArqueroBuilder() {
		this.arquero = new Personaje();
	}

	@Override
	public void buildNombre(String nombre) {
		this.arquero.setNombre(nombre);
	}

	@Override
	public void buildArma() {
		this.arquero.setArma(new Arco());
	}

	@Override
	public void buildArmadura() {
		this.arquero.setArmadura(new Cuero());
	}

	@Override
	public void buildHabilidad() {
		this.arquero.setHabilidad("Combate a distancia");
	}

	@Override
	public Personaje getResultado() {
		return this.arquero;
	}
	
	

}
