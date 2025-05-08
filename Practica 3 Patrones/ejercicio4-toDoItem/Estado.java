package ejercicio4;

import java.time.Duration;
import java.time.Instant;

public abstract class Estado {
	
	
	public abstract void start(ToDoItem tarea);
	public abstract void togglePause(ToDoItem tarea);
	public abstract void finish(ToDoItem tarea);
	public abstract Duration workedTime(ToDoItem tarea);
	public abstract void addComment(String comentario, ToDoItem tarea);

}
