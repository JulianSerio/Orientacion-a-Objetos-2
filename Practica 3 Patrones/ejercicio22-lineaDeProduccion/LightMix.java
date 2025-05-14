package ar.edu.unlp.objetos.oo2.ejercicio22_lineaDeProduccion;

public class LightMix extends ProcessStep{

	@Override
	protected boolean basicExecute(MixingTank tank) {
		return tank.heatPower(20) && tank.mixerPower(5);
	}

}
