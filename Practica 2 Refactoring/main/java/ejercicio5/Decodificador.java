package ejercicio5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Decodificador {
	private List<Pelicula> reprodujo;
	private List<Pelicula> grilla;
	private Estrategia estrategia;
	
	public Decodificador(List<Pelicula> reprodujo, List<Pelicula> grilla, Estrategia estrategia) {
		this.reprodujo = reprodujo;
		this.grilla = grilla;
		this.estrategia = estrategia;
	}
	
	public void reproducir(Pelicula p) {
		this.reprodujo.add(p);
	}

	public List<Pelicula> recomendarPeliculas(){
		return estrategia.recomendarPeliculas(this);
	}

	public List<Pelicula> masReciente() {
	    return grilla.stream()
	            .filter(peli -> !reprodujo.contains(peli)) // que no esten reproducidas
	            .sorted(Comparator.comparing(Pelicula::getAnioEstreno).reversed()) // ordena por fecha descendente
	            .limit(3)
	            .collect(Collectors.toList());
	}
	
	public List<Pelicula> masSimilaridad(){
		List<Pelicula> similares = new ArrayList<Pelicula>();
		//Tomar primera pelicula
		Pelicula ultimaVista = this.peliculaMasReciente(); 
		//Recorrer Grilla 
		if (ultimaVista != null) {
			for (Pelicula peli : grilla) {
				//si no la reproduje y es similar
				if (peli.esSimilar(ultimaVista) && !reprodujo.contains(peli)) 
					similares.add(peli);
			}
		}
		if (similares.isEmpty()) similares.addAll(grilla);
		return similares.stream().limit(3).collect(Collectors.toList());
		
	}
	
	public List<Pelicula> masPuntaje() {
	    return grilla.stream()
	            .filter(peli -> !reprodujo.contains(peli)) // que no esten reproducidas
	            .sorted(Comparator.comparing(Pelicula::getPuntaje).reversed()) // ordena por fecha descendente
	            .limit(3)
	            .collect(Collectors.toList());
	}

	private Pelicula peliculaMasReciente() {
		return reprodujo.stream()
				.max(Comparator.comparing(Pelicula::getAnioEstreno))
				.orElse(null);
	}
	
	public void setEstrategia(Estrategia estrategia) {
		this.estrategia = estrategia;
	}
	
	public List<Pelicula> getGrilla() { return grilla; }
    public List<Pelicula> getReproducidas() { return reprodujo; }   
}
