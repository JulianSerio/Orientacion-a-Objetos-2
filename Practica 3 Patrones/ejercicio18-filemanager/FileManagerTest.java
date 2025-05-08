package ar.edu.unlp.objetos.oo2.ejercicio18_filemanager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileManagerTest {
	private FileManager fileM;
	private FileOO2 file;
	private FileComponent vista;
	
	@BeforeEach
	void setUp() {
		fileM = new FileManager();
		file = new FileOO2("Archivo",".txt",4.5,"03/05/2025","20/01/2025","L+R");
		vista = new PermisosDecorator(
					new FechaCreacionDecorator(
						new FechaModificacionDecorator(
							new TamanoDecorator(
									new ExtensionDecorator(
											new NombreDecorator(file,file),file),file),file),file),file);
	}
	
	@Test
	void testMostrarArchivo() {
		assertEquals(" Archivo .txt 4.5 03/05/2025 20/01/2025 L+R",fileM.mostrarArchivo(vista));
	}

}
