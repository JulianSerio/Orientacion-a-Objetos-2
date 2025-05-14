package ar.edu.unlp.objetos.oo2.ejercicio18_filemanager;

public class ExtensionDecorator extends FileDecorator{

	public ExtensionDecorator(FileComponent component) {
		super(component);
	}

	@Override
	protected String decorar() {
		return this.getExtencion();
	}

}
