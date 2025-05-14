package ar.edu.unlp.objetos.oo2.ejercicio18_filemanager;

public class TamanoDecorator extends FileDecorator{

	public TamanoDecorator(FileComponent component) {
		super(component);
	}

	@Override
	protected String decorar() {
		return this.getTamano().toString();
	}

}
