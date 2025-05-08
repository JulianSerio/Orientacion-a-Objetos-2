package ejercicio4;

import java.time.Duration;

public class EnProgreso extends Estado {

	@Override
	public void start(ToDoItem tarea) {
		throw new RuntimeException("El objeto ToDoItem ya esta empezado");
	}

	@Override
	public void togglePause(ToDoItem tarea) {
		tarea.setEstado(new Pausada());
	}

	@Override
	public void finish(ToDoItem tarea) {
		tarea.setEstado(new Finalizada());	
		tarea.finalizarContador();
	}

	@Override
	public Duration workedTime(ToDoItem tarea) {
		return tarea.contadorHastaAhora();
	}

	@Override
	public void addComment(String comentario, ToDoItem tarea) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en finalizado");
	}

}
