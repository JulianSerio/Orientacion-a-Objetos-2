package ar.edu.unlp.objetos.oo2.ejercicio18_filemanager;

public class PermisosDecorator extends FileDecorator{

	public PermisosDecorator(FileComponent component) {
		super(component);
	}

	@Override
	protected String decorar() {
		return this.getPermisos();
	}

}
