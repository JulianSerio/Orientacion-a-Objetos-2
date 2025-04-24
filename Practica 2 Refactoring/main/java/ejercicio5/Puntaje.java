package ejercicio5;

import java.util.List;

public class Puntaje implements Estrategia{

	@Override
	public List<Pelicula> recomendarPeliculas(Decodificador deco) {
		return deco.masPuntaje();
	}

}
