package ar.edu.unlp.objetos.oo2.ejercicio20_juegoDeRol;

public interface PersonajeBuilder {
	public void buildNombre(String nombre);
	public void buildArma();
	public void buildArmadura();
	public void buildHabilidad();
	public Personaje getResultado();
}
