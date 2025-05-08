package ar.edu.unlp.objetos.oo2.ejercicio18_filemanager;

public abstract class FileDecorator implements FileComponent {
	private FileComponent component;
	private FileOO2 file;

	public FileDecorator(FileComponent component, FileOO2 file ) {
		this.component = component;
		this.file = file;
	}

	public FileComponent getComponent() {
		return component;
	}

	public FileOO2 getFile() {
		return file;
	}
	
	
	
	
}
