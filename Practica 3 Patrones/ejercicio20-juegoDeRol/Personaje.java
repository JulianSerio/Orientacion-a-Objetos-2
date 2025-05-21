package ar.edu.unlp.objetos.oo2.ejercicio20_juegoDeRol;

public class Personaje {
	private String nombre;
	private String habilidad;
	private int vida = 100;
	private Armadura armadura;
	private Arma arma;
	

	public int getVida() {
		return vida;
	}
	
	public void setVida(int vida) {
		this.vida = vida;
	}

	public String combateContra(Personaje p2) {
	    if (!this.puedeParticipar()) {
	        return "El Jugador 1 no puede participar";
	    }

	    if (!p2.puedeParticipar()) {
	        return "El Jugador 2 no puede participar";
	    }

	    int daño = p2.getArmadura().recibirDaño(this.arma);

	    p2.setVida(p2.getVida() - daño);

	    if (!p2.puedeParticipar()) {
	        return "El Jugador 2 murio";
	    }

	    return "El Jugador 1 le quito " + daño + " de vida al Jugador 2";
	}

	
	public boolean puedeParticipar() {
		return vida > 0;
	}

	public String getNombre() {
		return nombre;
	}

	public String getHabilidad() {
		return habilidad;
	}

	public Armadura getArmadura() {
		return armadura;
	}

	public Arma getArma() {
		return arma;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}

	public void setArmadura(Armadura armadura) {
		this.armadura = armadura;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}
	
	


}
