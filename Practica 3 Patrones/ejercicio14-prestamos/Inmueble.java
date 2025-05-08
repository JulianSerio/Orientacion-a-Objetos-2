package ar.edu.unlp.objetos.oo2.ejercicio14_prestamos;

public class Inmueble extends Bien {
	private String direccion;
	private double superficie;
	private double costoM2;

	public Inmueble(String direccion, double superficie, double costoM2) {
		this.setLiquidez(0.2);
		this.direccion = direccion;
		this.superficie = superficie;
		this.costoM2 = costoM2;
	}

	@Override
	protected double calcularValor() {
		return this.superficie * this.costoM2;
	}

}
