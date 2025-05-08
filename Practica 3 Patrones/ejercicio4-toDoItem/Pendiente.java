package ejercicio4;

import java.time.Duration;

public class Pendiente extends Estado {

	@Override
	public void start(ToDoItem tarea) {
		tarea.setEstado(new EnProgreso());	
		tarea.iniciarContador();
	}

	@Override
	public void togglePause(ToDoItem tarea) {
		throw new RuntimeException("El objeto ToDoItem no se inicio");
	}

	@Override
	public void finish(ToDoItem tarea) {
		throw new RuntimeException("El objeto ToDoItem no se inicio");
	}

	@Override
	public Duration workedTime(ToDoItem tarea) {
		throw new RuntimeException("El objeto ToDoItem no se inicio");
	}

	@Override
	public void addComment(String comentario, ToDoItem tarea) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en finalizado");
	}

}
