package ejercicio5;

import java.util.List;

public class Novedad implements Estrategia{

	@Override
	public List<Pelicula> recomendarPeliculas(Decodificador deco) {
		return deco.masReciente();
	}

}
