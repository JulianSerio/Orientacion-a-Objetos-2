package ejercicio4;

import java.time.Duration;
import java.time.Instant;

public class ToDoItem {
	private String name;
	private Estado estado;
	private String comentario;
	private Instant inicio;
	private Instant fin;

	public ToDoItem(String name) {
		estado = new Pendiente();
		this.name = name;
	}
	
	public void start() {
		estado.start(this);
	}
	public void togglePause(){
		estado.togglePause(this);
	}
	
	public void finish() {
		estado.finish(this);
	}
	
	public Duration workedTime() {
		return estado.workedTime(this);
	}
	
	public void addComment(String comment){
		estado.addComment(comment, this);
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public void iniciarContador() {
		this.inicio = Instant.now();
	}
	
	public void finalizarContador() {
		this.fin = Instant.now();
	}
	
	public Duration contadorInicioFin() {
		return Duration.between(inicio, fin);
	}
	
	public Duration contadorHastaAhora() {
		return Duration.between(inicio, Instant.now());
	}

	public void setComentario(String comment) {
		this.comentario = comment;
	}

	public String getComentario() {
		return comentario;
	}
	
	

}