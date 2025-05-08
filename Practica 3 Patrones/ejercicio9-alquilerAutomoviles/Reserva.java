package ejercicio9;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reserva {
	private int cantidadDias;
	private LocalDate fecha;
	private Usuario conductor;
	private AutoEnAlquiler auto;

	public Reserva(AutoEnAlquiler auto, LocalDate fecha, int dias) {
		this.cantidadDias = dias;
		this.auto = auto;
		this.fecha = fecha;
	}
	
	public double montoAPagar() {
		return this.cantidadDias * auto.getPrecioPorDia();
	}
	
	public double montoAReembolsar(LocalDate fechaCancelacion) {
		return this.auto.montoReembolso(this,fechaCancelacion);
	}
	
	public double getDias() {
		return this.cantidadDias;
	}
	
	public boolean semanaAntes(LocalDate fechaCancelacion) {
		long diasAnticipacion = ChronoUnit.DAYS.between(fechaCancelacion,this.fecha);
		return diasAnticipacion >= 7;
	}
	
	public boolean dosDiasAntes(LocalDate fechaCancelacion) {
		long diasAnticipacion = ChronoUnit.DAYS.between(fechaCancelacion,this.fecha);
		return diasAnticipacion >= 2 && diasAnticipacion < 7; 
	}

}
