package ar.edu.unlp.objetos.oo2.ejercicio18_filemanager;

public class ExtensionDecorator extends FileDecorator{

	public ExtensionDecorator(FileComponent component, FileOO2 file) {
		super(component, file);
	}

	@Override
	public String prettyPrint() {
		return this.getComponent().prettyPrint() + " " + this.getFile().getExtencion();
	}

}
