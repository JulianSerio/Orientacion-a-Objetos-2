package ejercicio9;

import java.time.LocalDate;

public class Flexible implements PoliticaCancelacion{

	@Override
	public double montoAReebolsar(Reserva res, LocalDate fechaCancelacion) {
		return res.montoAPagar();
	}

}
