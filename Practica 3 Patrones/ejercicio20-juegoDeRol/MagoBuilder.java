package ar.edu.unlp.objetos.oo2.ejercicio20_juegoDeRol;

public class MagoBuilder implements PersonajeBuilder{
	private Personaje mago;
	
	public MagoBuilder() {
		mago = new Personaje();
	}

	@Override
	public void buildNombre(String nombre) {
		mago.setNombre(nombre);
	}

	@Override
	public void buildArma() {
		mago.setArma(new Baston());
	}

	@Override
	public void buildArmadura() {
		mago.setArmadura(new Cuero());
	}

	@Override
	public void buildHabilidad() {
		mago.setHabilidad("Magia y Combate a distancia");
	}

	@Override
	public Personaje getResultado() {
		return null;
	}
	
	
}
