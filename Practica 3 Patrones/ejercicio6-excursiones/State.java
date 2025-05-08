package ejercicio6;

public interface State {
	public void inscribir(Excursion ex, Usuario user);
	public String obtenerInformacion(Excursion ex);
	public boolean verificarEstado(Excursion ex);
}
