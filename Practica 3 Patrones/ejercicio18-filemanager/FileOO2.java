package ar.edu.unlp.objetos.oo2.ejercicio18_filemanager;

import java.time.LocalDate;

public class FileOO2 implements FileComponent{
	private String nombre;
	private String extencion;
	private Double tamano;
	private String fechaModificacion;
	private String fechaCreacion;
	private String permisos;
	
	public FileOO2(String nombre, String extencion, Double tamano, String fechaModificacion, String fechaCreacion,
			String permisos) {
		this.nombre = nombre;
		this.extencion = extencion;
		this.tamano = tamano;
		this.fechaModificacion = fechaModificacion;
		this.fechaCreacion = fechaCreacion;
		this.permisos = permisos;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getExtencion() {
		return extencion;
	}

	public Double getTamano() {
		return tamano;
	}

	public String getFechaModificacion() {
		return fechaModificacion;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public String getPermisos() {
		return permisos;
	}

	@Override
	public String prettyPrint() {
		return this.getNombre();
	}
}
