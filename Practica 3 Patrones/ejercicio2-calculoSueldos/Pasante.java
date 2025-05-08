package ejercicio2;

public class Pasante extends Empleado{
	private int examenesRendidos;
	
	public Pasante(double sueldo, int examenesRendidos) {
		super(sueldo);
		this.examenesRendidos = examenesRendidos;
	}

	@Override
	public double adicional() {
		return this.examenesRendidos * this.montoPorExamen();
	}

}
