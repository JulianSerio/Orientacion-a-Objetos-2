package ar.edu.unlp.objetos.oo2.ejercicio22_lineaDeProduccion;

public class Purge extends ProcessStep {

	@Override
	protected boolean basicExecute(MixingTank tank) {
		return tank.heatPower(0) 
				&& tank.mixerPower(0) 
				&& tank.purge();
	}

}
