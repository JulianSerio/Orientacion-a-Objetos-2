package ar.edu.unlp.objetos.oo2.ejercicio14_prestamos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler extends Bien {
	private LocalDate comienzoContrato;
	private LocalDate finContrato;
	private double costoMensual;

	public Alquiler(LocalDate comienzoContrato, LocalDate finContrato, double costoMensual) {
		this.setLiquidez(0.9);
		this.comienzoContrato = comienzoContrato;
		this.finContrato = finContrato;
		this.costoMensual = costoMensual;
	}

	@Override
	protected double calcularValor() {
		return this.mesesQueFaltan() * this.costoMensual;
	}
	
	private int mesesQueFaltan() {
		return (int)ChronoUnit.MONTHS.between(LocalDate.now(),finContrato);
	}

}
