package ar.edu.unlp.objetos.oo2.ejercicio2;

public class Main {
	public static void main (String argv[]) {
		Opcion jugador1 = Opcion.TIJERA;
		Opcion jugador2 = Opcion.SPOCK;
		
		if (jugador1.ganaContra(jugador2)) {
			System.out.println("Jugador 1 gana!");
		}else 
			if (jugador2.ganaContra(jugador1)) {
				System.out.println("Jugador 2 gana!");
			}else { System.out.println("Empate!");
		}
	}
}
