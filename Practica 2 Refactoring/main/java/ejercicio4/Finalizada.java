package ejercicio4;

import java.time.Duration;

public class Finalizada extends Estado {

	@Override
	public void start(ToDoItem tarea) {
		throw new RuntimeException("El objeto ToDoItem ya se encuentra finalizado");
	}

	@Override
	public void togglePause(ToDoItem tarea) {
		throw new RuntimeException("El objeto ToDoItem ya se encuentra en finalizado");
	}

	@Override
	public void finish(ToDoItem tarea) {
		throw new RuntimeException("El objeto ToDoItem ya se encuentra en finalizado");
	}

	@Override
	public Duration workedTime(ToDoItem tarea) {
		return tarea.contadorInicioFin();
	}

	@Override
	public void addComment(String comentario, ToDoItem tarea) {
		tarea.setComentario(comentario);
	}

}
