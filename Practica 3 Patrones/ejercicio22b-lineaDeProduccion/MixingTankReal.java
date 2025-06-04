package ar.edu.unlp.objetos.oo2.ejercicio22_lineaDeProduccion;

public class MixingTankReal extends MixingTank{
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
		int duration = 4;
		for (int i = 0; i < duration; i++) {
			double incremento = this.calcularIncrementoTemperatura(this.tempCalor);
			this.tempContenido += incremento;
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.volumenOcupado = 0;
		return this.purgar = true;
	}
	
	private double calcularIncrementoTemperatura(int heatPower) {
        if (heatPower >= 100) return 5.0;
        else if (heatPower >= 75) return 4.0;
        else if (heatPower >= 50) return 2.0;
        else if (heatPower >= 25) return 1.0;
        else return 0.0;
    }
	
	public double upTo() {
		return this.volumenOcupado;
	}
	
	public double temperature() {
		return this.tempContenido;
	}

}
