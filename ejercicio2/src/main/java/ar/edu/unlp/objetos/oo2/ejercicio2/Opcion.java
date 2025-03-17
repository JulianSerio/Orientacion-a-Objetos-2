package ar.edu.unlp.objetos.oo2.ejercicio2;

public enum Opcion {
	PAPEL, TIJERA, PIEDRA, LAGARTO, SPOCK;
	
	
	public boolean ganaContra(Opcion otra) {
		switch (this) {
		case PIEDRA:
			return (otra == TIJERA || otra == LAGARTO);
		case TIJERA:
			return (otra == PAPEL || otra == LAGARTO);
		case PAPEL:
			return (otra == PIEDRA || otra == SPOCK);
		case LAGARTO:
			return (otra == PAPEL || otra == SPOCK);
		case SPOCK:
			return (otra == TIJERA || otra == PIEDRA);
		default: return false;
		}
	}
	
	
	/*
	//Opciones de victoria
	public boolean ganaContra(Opcion otra) {
		return (this == PIEDRA && otra == TIJERA) ||
	               (this == TIJERA && otra == PAPEL) ||
	               (this == PAPEL && otra == PIEDRA);
	}
	*/
	

}
