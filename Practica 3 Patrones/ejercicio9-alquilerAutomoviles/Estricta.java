package ejercicio9;

import java.time.LocalDate;

public class Estricta implements PoliticaCancelacion {

	@Override
	public double montoAReebolsar(Reserva res, LocalDate fechaCancelacion) {
		return 0;
	}

}
