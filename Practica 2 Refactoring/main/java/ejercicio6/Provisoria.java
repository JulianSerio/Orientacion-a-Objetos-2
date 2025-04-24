package ejercicio6;

public class Provisoria implements State {

	public int faltan(int minimo, int hastaAhora) {
		return minimo - hastaAhora;
	}
	
	@Override
	public String obtenerInformacion(Excursion ex) {
		return ex.toString() + "faltan para cupo minimo= "+this.faltan(ex.getCupoMin(), ex.getInscriptos().size());
	}

	@Override
	public boolean verificarEstado(Excursion ex) {
		return ex.getInscriptos().size() < ex.getCupoMin();
	}

	@Override
	public void inscribir(Excursion ex, Usuario user) {
		if (this.verificarEstado(ex)) {
			ex.agregarAInscriptos(user);
			if (ex.getInscriptos().size() == ex.getCupoMin()) {
				ex.setEstado(new Definitiva());
			}
		}
	}



}
