package ejercicio2;

public abstract class Empleado {
	private double sueldo;
	
	public Empleado(double sueldo) {
		this.sueldo = sueldo;
	}

	public abstract double adicional();

	
	private double montoDescuentoAdicional() {
		return 0.05;
	}
	
	private double montoDescuentoSueldo() {
		return 0.13;
	}
	
	protected double montoPorHijo() {
		return 2000;
	}
	
	protected double montoPorCasado() {
		return 5000;
	}
	
	protected double montoPorAnioAntiguedad() {
		return 2000;
	}
	
	protected double montoPorExamen() {
		return 2000;
	}
		
	private double descuentoSueldo() {
		return (this.getSueldo() * this.montoDescuentoSueldo());
	}
	
	private double descuentoAdicional() {
		return (this.adicional() * this.montoDescuentoAdicional());
	}
	
	public double getSueldo() {
		return this.sueldo;
	}
	
	public double sueldo() {
		return (this.getSueldo() - this.descuentoSueldo()) + (this.adicional() - this.descuentoAdicional());
	}
	

}
