package ar.edu.unlp.objetos.oo2.ejercicio14_prestamos;

public abstract class Bien {
	private double liquidez;
	
	public Bien() {
		
	}
	
	public double valorPrendatario() {
		return this.calcularValor() * this.liquidez;
	}
	
	protected void setLiquidez(double liquidez) {
		this.liquidez = liquidez;
	}
	
	protected abstract double calcularValor();
	
}
