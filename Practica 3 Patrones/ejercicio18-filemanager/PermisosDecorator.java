package ar.edu.unlp.objetos.oo2.ejercicio18_filemanager;

public class PermisosDecorator extends FileDecorator{

	public PermisosDecorator(FileComponent component, FileOO2 file) {
		super(component, file);
	}

	@Override
	public String prettyPrint() {
		return this.getComponent().prettyPrint() + " " + this.getFile().getPermisos();
	}

}
