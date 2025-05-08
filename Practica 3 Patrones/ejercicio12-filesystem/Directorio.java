package ar.edu.unlp.objetos.oo2.ejercicio12_filesystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Directorio extends Contenido{
	private List<Contenido> contenidos;
	
	public Directorio(List<Contenido> contenido, String nombre, LocalDate fechaCreacion) {
		super(nombre,fechaCreacion);
		this.contenidos = contenido;
	}
	
	@Override
	public int tamanoTotalOcupado() {
		return 32 + this.contenidos.stream()
				.mapToInt(c -> c.tamanoTotalOcupado())
				.sum();
	}

	@Override
	public Archivo archivoMasGrande() {
		return this.contenidos.stream()
				.map(c -> c.archivoMasGrande())
				.filter(Objects::nonNull)
				.max(Comparator.comparing(Archivo::getTamano))
				.orElse(null);
	}
	
	@Override
	public Archivo archivoMasNuevo() {
	    return this.contenidos.stream()
	    		.map(c -> c.archivoMasNuevo())
	    		.filter(Objects::nonNull)
	    		.max(Comparator.comparing(a -> a.getFechaCreacion()))
	    		.orElse(null);
	}


	@Override
	public Archivo buscar(String nombre) {
		return this.contenidos.stream()
				.map(c -> c.buscar(nombre))
				.filter(Objects::nonNull)
				.findFirst()
				.orElse(null);
	}

	@Override
	public List<Contenido> buscarTodos(String nombre) {
		return this.contenidos.stream()
				.map(c -> c.buscarTodos(nombre))
				.filter(Objects::nonNull)
				.flatMap(List::stream)
				.collect(Collectors.toList());
	}

	@Override
	public String listadoDeContenido() {
		return this.contenidos.stream()
			.map(c -> "/" + this.getNombre() + c.listadoDeContenido())
			.collect(Collectors.joining("\n"));
	}


}
