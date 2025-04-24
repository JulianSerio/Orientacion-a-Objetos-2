package ejercicio9;

import java.time.LocalDate;

public class AutoEnAlquiler {
	private double precioPorDia;
	private int cantPlazas;
	private String marca;
	private PoliticaCancelacion politica;
	
	public AutoEnAlquiler(double precio) {
		this.precioPorDia = precio;
	}


	public void setPoliticaCancelacion(PoliticaCancelacion pol) {
		this.politica = pol;
	}
	
	public double getPrecioPorDia() {
		return this.precioPorDia;
	}
	
	public double montoReembolso(Reserva r,LocalDate fechaCancelacion) {
		return this.politica.montoAReebolsar(r,fechaCancelacion);
	}
	
}
