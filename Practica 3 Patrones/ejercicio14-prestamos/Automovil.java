package ar.edu.unlp.objetos.oo2.ejercicio14_prestamos;

public class Automovil extends Bien{
	private String modelo;
	private double kilometraje;
	private double costo0Km;
	private int antiguedad;

	public Automovil(String modelo, double kilometraje, double costo0Km, int antiguedad) {
		this.setLiquidez(0.7);
		this.modelo = modelo;
		this.kilometraje = kilometraje;
		this.costo0Km = costo0Km;
		this.antiguedad = antiguedad;
	}

	@Override
	protected double calcularValor() {
		double porcentaje = 0.9;
		return this.costo0Km * Math.pow(porcentaje, this.antiguedad);
	}

}
