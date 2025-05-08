package ejercicio9;

import java.time.LocalDate;

public class Moderada implements PoliticaCancelacion {

	@Override
	public double montoAReebolsar(Reserva res, LocalDate fechaCancelacion) {
		if (res.dosDiasAntes(fechaCancelacion)) return res.montoAPagar() / 2;
		else if (res.semanaAntes(fechaCancelacion)) return res.montoAPagar();
		return 0;
	}

}
