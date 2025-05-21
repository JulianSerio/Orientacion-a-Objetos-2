package ar.edu.unlp.objetos.oo2.ejercicio20_juegoDeRol;

public class Juego {
	private PersonajeBuilder builder;
	
	public Personaje contruirPersonaje(String nombre) {
		builder.buildNombre(nombre);
		builder.buildArma();
		builder.buildArmadura();
		builder.buildHabilidad();
		return builder.getResultado();
	}
	
	public void setBuilder(PersonajeBuilder builder) {
		this.builder = builder;
	}
}
