package ar.edu.unlp.objetos.oo2.ejercicio12_filesystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Archivo extends Contenido{
	private String contenido;

	public Archivo(String nombre, LocalDate fechaCreacion) {
		super(nombre, fechaCreacion);
	}
	
	public void agregarContenido(String contenido) {
		this.contenido = contenido;
	}

	@Override
	public int tamanoTotalOcupado() {
		return this.getTamano();
	}

	@Override
	public Archivo archivoMasGrande() {
		return this;
	}

	@Override
	public Archivo archivoMasNuevo() {
		return this;
	}

	@Override
	public Archivo buscar(String nombre) {
		if (this.getNombre().equals(nombre)) return this;
		else return null;
	}

	@Override
	public List<Contenido> buscarTodos(String nombre) {
		List<Contenido> resultados = new ArrayList<>();
		if (this.getNombre().equals(nombre)) resultados.add(this);
		return resultados;
	}

	@Override
	public String listadoDeContenido() {
		return "/" + this.getNombre() ;
	}

}
