package ejercicio6;

public class Definitiva implements State{

	public int faltan(int maximo, int hastaAhora) {
		return maximo - hastaAhora;
	}
	
	@Override
	public String obtenerInformacion(Excursion ex) {
		return ex.toString() + "emails= " + ex.obtenerEmails() + ", faltan para cupo maximo= "+this.faltan(ex.getCupoMax(), ex.getInscriptos().size());
	}

	@Override
	public boolean verificarEstado(Excursion ex) {
		return ex.getInscriptos().size() >= ex.getCupoMin() && ex.getInscriptos().size() < ex.getCupoMax();
	}

	@Override
	public void inscribir(Excursion ex, Usuario user) {
		if (this.verificarEstado(ex)) {
			ex.agregarAInscriptos(user);
			if (ex.getInscriptos().size() == ex.getCupoMax())
				ex.setEstado(new Maxima());
		}
	}


}
