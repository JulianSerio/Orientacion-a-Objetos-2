package ejercicio2;

public class Temporario extends Empleado{
	private boolean casado;
	private int cantHijos;
	private int horasTrabajadas;
	
	public Temporario(double sueldo, boolean casado, int cantHijos, int horasTrabajadas) {
		super(sueldo);
		this.casado = casado;
		this.cantHijos = cantHijos;
		this.horasTrabajadas = horasTrabajadas;
	}

	@Override
	public double adicional() {
		return (this.cantHijos * this.montoPorHijo()) + estaCasado();
	}
	
	@Override
	public double getSueldo() {
		return super.getSueldo() + (horasTrabajadas * this.montoPorHora());
	}

	private double estaCasado() {
		if (casado) return this.montoPorCasado();
		else return 0;
	}
	
	private int montoPorHora() {
		return 300;
	}
}
