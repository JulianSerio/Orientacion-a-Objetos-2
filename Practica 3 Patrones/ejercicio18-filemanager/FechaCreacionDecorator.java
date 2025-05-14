package ar.edu.unlp.objetos.oo2.ejercicio18_filemanager;

public class FechaCreacionDecorator extends FileDecorator{

	public FechaCreacionDecorator(FileComponent component) {
		super(component);
	}
	
	protected String decorar() {
		return this.getFechaCreacion();
	}

}
