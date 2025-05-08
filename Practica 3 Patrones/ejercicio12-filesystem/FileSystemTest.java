package ar.edu.unlp.objetos.oo2.ejercicio12_filesystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileSystemTest {
	private FileSystem f;
	private Directorio dir1,dir2;
	private Archivo arch1,arch2;
	
	@BeforeEach
	void setUp() {
		arch1 = new Archivo("Arch1",LocalDate.of(2025, 1, 30));
		arch2 = new Archivo("Arch2",LocalDate.of(2025, 2, 20));
		List<Contenido> content1 = new ArrayList<Contenido>();
		content1.add(arch1);
		dir1 = new Directorio(content1,"Dir1",LocalDate.of(2025, 4,20));
		List<Contenido> content2 = new ArrayList<Contenido>();
		content2.add(arch2);
		content2.add(dir1);
		dir2 = new Directorio(content2,"Dir2",LocalDate.of(2025,2,25));
		f = new FileSystem(dir2);
	}
	
	@Test
	void testTamanoTotalOcupado() {
		//4 * 32 = 128
		assertEquals(128,f.tamanoTotalOcupado());
	}
	
	@Test
	void testListado() {
		StringBuilder sb = new StringBuilder();
		sb.append("/Dir2/Arch2\n");
		sb.append("/Dir2/Dir1/Arch1");
		assertNotEquals(" ",f.listadoDeContenido());
		assertEquals(sb.toString(),f.listadoDeContenido());
	}
	
	@Test
	void testArchivoMasNuevo() {
		assertEquals(arch2,f.archivoMasNuevo());
		assertNotEquals(arch1,f.archivoMasNuevo());
	}
	
	@Test 
	void testArchivoMasGrande() {
		assertEquals(arch2,f.archivoMasGrande());
		assertNotEquals(arch1,f.archivoMasGrande());
	}
	
	@Test
	void testBuscar() {
		assertEquals(arch1,f.buscar("Arch1"));
		assertEquals(arch2,f.buscar("Arch2"));
	}
	
	@Test
	void testBuscarTodos() {
		arch1 = new Archivo("Arch1",LocalDate.of(2025, 1, 30));
		arch2 = new Archivo("Arch1",LocalDate.of(2025, 2, 20));
		List<Contenido> content1 = new ArrayList<Contenido>();
		content1.add(arch1);
		dir1 = new Directorio(content1,"Dir1",LocalDate.of(2025, 4,20));
		List<Contenido> content2 = new ArrayList<Contenido>();
		content2.add(arch2);
		content2.add(dir1);
		dir2 = new Directorio(content2,"Dir2",LocalDate.of(2025,2,25));
		f = new FileSystem(dir2);
		List<Contenido> lista = f.buscarTodos("Arch1");
		assertTrue(lista.contains(arch1));
		assertTrue(lista.contains(arch2));
		assertFalse(lista.contains(dir1));
	}
	
}
