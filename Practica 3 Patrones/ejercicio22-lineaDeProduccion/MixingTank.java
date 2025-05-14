package ar.edu.unlp.objetos.oo2.ejercicio22_lineaDeProduccion;

public class MixingTank {
	private int tempCalor;
	private int potenciaMezcladora;
	private boolean purgar;
	private double volumenOcupado;
	private double tempContenido;
	
	public boolean heatPower(int porcentaje) {
		if (tempCalor >= 0 && tempCalor <= 100) {
			this.tempCalor = porcentaje;
			return true;
		}
		return false;		
	}
	
	public boolean mixerPower(int porcentaje) {
		if (potenciaMezcladora >= 0 && potenciaMezcladora <= 100) {
			this.potenciaMezcladora = porcentaje;
			return true;
		}
		return false;
	}
	
	public boolean purge() {
		return this.purgar = true;
	}
	
	public double upTo() {
		return this.volumenOcupado;
	}
	
	public double temperature() {
		return this.tempContenido;
	}

}
