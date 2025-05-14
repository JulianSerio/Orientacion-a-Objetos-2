package ar.edu.unlp.objetos.oo2.ejercicio18_filemanager;

public class NombreDecorator extends FileDecorator {

	public NombreDecorator(FileComponent component) {
		super(component);
	}

	@Override
	protected String decorar() {
		return this.getNombre();
	}
}
