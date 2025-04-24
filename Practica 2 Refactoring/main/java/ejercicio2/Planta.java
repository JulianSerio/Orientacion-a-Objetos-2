package ejercicio2;

public class Planta extends Empleado {
	private boolean casado; 
	private int cantHijos;
	private int aniosAntiguedad;
	
	public Planta(double sueldo, boolean casado, int cantHijos, int aniosAntiguedad) {
		super(sueldo);
		this.casado = casado;
		this.cantHijos = cantHijos;
		this.aniosAntiguedad = aniosAntiguedad;
	}

	@Override
	public double adicional() {
		return (this.cantHijos * this.montoPorHijo()) + 
				(this.aniosAntiguedad * this.montoPorAnioAntiguedad()) + 
				estaCasado();
	}
	
	private double estaCasado() {
		if (casado) return this.montoPorCasado();
		else return 0;
	}
	
	
	
	

}
