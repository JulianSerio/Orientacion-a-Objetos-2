package ar.edu.unlp.objetos.oo2.ejercicio18_filemanager;

public class FechaModificacionDecorator extends FileDecorator{

	public FechaModificacionDecorator(FileComponent component) {
		super(component);
	}
	
	@Override
	protected String decorar() {
		return this.getFechaModificacion();
	}

}
