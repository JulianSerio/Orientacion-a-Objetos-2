package ar.edu.unlp.objetos.oo2.ejercicio12_filesystem;

import java.util.List;

public class FileSystem {
	private Directorio raiz;
	
	public FileSystem(Directorio raiz) {
		this.raiz = raiz;
	}
	public int tamanoTotalOcupado() {
		return raiz.tamanoTotalOcupado();
	}
	/**
	* Retorna el archivo con mayor cantidad de bytes en cualquier nivel del
	* filesystem
	*/
	public Archivo archivoMasGrande() {
		return raiz.archivoMasGrande();
	}
	/**
	* Retorna el archivo con fecha de creación más reciente en cualquier nivel
	* del filesystem
	*/
	public Archivo archivoMasNuevo() {
		return raiz.archivoMasNuevo();
	}
	/**
	* Retorna el primer elemento con el nombre solicitado contenido en cualquier
	* nivel del filesystem
	*/
	public Contenido buscar(String nombre){
		return raiz.buscar(nombre);
	}
	/**
	* Retorna la lista con los elementos que coinciden con el nombre solicitado
	* contenido en cualquier nivel del filesystem
	*/
	public List<Contenido> buscarTodos(String nombre){
		return raiz.buscarTodos(nombre);
	}
	/**
	* Retorna un String con los nombres de los elementos contenidos en todos los
	* niveles del filesystem. De cada elemento debe retornar el path completo
	* (similar al comando pwd de linux) siguiendo el modelo presentado a
	* continuación
	/Directorio A
	/Directorio A/Directorio A.1
	/Directorio A/Directorio A.1/Directorio A.1.1
	/Directorio A/Directorio A.1/Directorio A.1.2
	/Directorio A/Directorio A.2
	/Directorio B
	*/
	public String listadoDeContenido() {
		return raiz.listadoDeContenido();
	}

}
