package ar.edu.unlp.objetos.oo2.ejercicio18_filemanager;

public abstract class FileDecorator implements FileComponent {
	private FileComponent component;

	public FileDecorator(FileComponent component) {
		this.component = component;
	}

	public FileComponent getComponent() {
		return component;
	}
	
	@Override
	public String prettyPrint() {
		return this.component.prettyPrint() + " " + this.decorar();
	}
	
	protected abstract String decorar(); 
	
	@Override
	public String getNombre() {
		return this.component.getNombre();
	}

	@Override
	public String getExtencion() {
		return this.component.getExtencion();
	}

	@Override
	public Double getTamano() {
		return this.component.getTamano();
	}

	@Override
	public String getFechaModificacion() {
		return this.component.getFechaModificacion();
	}

	@Override
	public String getFechaCreacion() {
		return this.component.getFechaCreacion();
	}

	@Override
	public String getPermisos() {
		return this.component.getPermisos();
	}
	
	
}
