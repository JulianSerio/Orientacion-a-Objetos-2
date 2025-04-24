package ejercicio6;

public class Maxima implements State{
	@Override
	public String obtenerInformacion(Excursion ex) {
		return ex.toString();
	}

	@Override
	public boolean verificarEstado(Excursion ex) {
		return ex.getInscriptos().size() == ex.getCupoMax();	
	}

	@Override
	public void inscribir(Excursion ex, Usuario user) {
		ex.agregarAEspera(user);
	
	}


}
