package ar.edu.unlp.objetos.oo2.Practica2;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ejercicio4.ToDoItem;



public class ToDoItemTest {
	private ToDoItem item;
		
	@BeforeEach
	public void setUp() {
		item = new ToDoItem("Configurar Api");
	}
	
	@Test
	public void testEstadoPendiente() {
		RuntimeException thrown = assertThrows(RuntimeException.class, () -> { item.finish();});
		assertEquals("El objeto ToDoItem no se inicio", thrown.getMessage());
		
		thrown = assertThrows(RuntimeException.class, () -> { item.workedTime();});
		assertEquals("El objeto ToDoItem no se inicio", thrown.getMessage());
		
		thrown = assertThrows(RuntimeException.class, () -> { item.addComment("tarea imporante");});
		assertEquals("El objeto ToDoItem no se encuentra en finalizado",thrown.getMessage());
		
		thrown = assertThrows(RuntimeException.class, () -> { item.togglePause();});
		assertEquals("El objeto ToDoItem no se inicio",thrown.getMessage());	
	}
	
	@Test
	public void testEstadoEnProgreso(){	
		item.start();
		
		RuntimeException thrown = assertThrows(RuntimeException.class, () -> { item.start();});
		assertEquals("El objeto ToDoItem ya esta empezado", thrown.getMessage());
		
		thrown = assertThrows(RuntimeException.class, () -> { item.addComment("tarea imporatnte");});
		assertEquals("El objeto ToDoItem no se encuentra en finalizado", thrown.getMessage());
		
		assertNotEquals(0,item.workedTime());
	}
	
	@Test
	public void testEstadoPausada(){	
		item.start();
		item.togglePause();
		
		RuntimeException thrown = assertThrows(RuntimeException.class, () -> { item.start();});
		assertEquals("El objeto ToDoItem ya se encuentra empezado", thrown.getMessage());
		
		thrown = assertThrows(RuntimeException.class, () -> { item.addComment("tarea imporatnte");});
		assertEquals("El objeto ToDoItem no se encuentra en finalizado", thrown.getMessage());
		
		assertNotEquals(0,item.workedTime());
			
	}
	
	@Test
	public void testEstadoFinalizada(){	
		item.start();
		item.togglePause();
		item.finish();
		
		RuntimeException thrown = assertThrows(RuntimeException.class, () -> { item.start();});
		assertEquals("El objeto ToDoItem ya se encuentra finalizado", thrown.getMessage());
		
		thrown = assertThrows(RuntimeException.class, () -> { item.togglePause();});
		assertEquals("El objeto ToDoItem ya se encuentra en finalizado", thrown.getMessage());
		
		thrown = assertThrows(RuntimeException.class, () -> { item.finish();});
		assertEquals("El objeto ToDoItem ya se encuentra en finalizado", thrown.getMessage());
		
		assertNotEquals(0,item.workedTime());
		
		item.addComment("la mejor tarea");
		assertEquals("la mejor tarea",item.getComentario());
	}

}