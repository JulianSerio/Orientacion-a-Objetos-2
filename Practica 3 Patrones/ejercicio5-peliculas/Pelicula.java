package ejercicio5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Pelicula {
	private String titulo;
	private LocalDate anioEstreno;
	private double puntaje;
	private List<Pelicula> pelisSimilares;
	
	public Pelicula(String titulo, LocalDate anioEstreno, double puntaje) {
		this.titulo = titulo;
		this.anioEstreno = anioEstreno;
		this.puntaje = puntaje;
		this.pelisSimilares = new ArrayList<Pelicula>();
	}

	public boolean esSimilar(Pelicula peli) {
		return this.pelisSimilares.contains(peli);
	}
	
	public void agregarSimilar(Pelicula p) {
		this.pelisSimilares.add(p);
		if (!p.getSimilares().contains(this))
			p.agregarSimilar(this);
	}
	
	private List<Pelicula> getSimilares() {
		return this.pelisSimilares;
	}

	public double getPuntaje() {
		return this.puntaje;
	}
	
	public LocalDate getAnioEstreno() {
		return this.anioEstreno;
	}
	

}
