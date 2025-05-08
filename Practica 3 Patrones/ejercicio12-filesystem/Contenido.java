package ar.edu.unlp.objetos.oo2.ejercicio12_filesystem;

import java.time.LocalDate;
import java.util.List;

public abstract class Contenido {
	private String nombre;
	private int tamano = 32;
	private LocalDate fechaCreacion;
	
	public Contenido(String nombre, LocalDate fechaCreacion) {
		super();
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public int getTamano() {
		return tamano;
	}
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}
	
	public abstract int tamanoTotalOcupado();
	public abstract Archivo archivoMasGrande();
	public abstract Archivo archivoMasNuevo();
	public abstract Archivo buscar(String nombre);
	public abstract List<Contenido> buscarTodos(String nombre);
	public abstract String listadoDeContenido();
	

}
