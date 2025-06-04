package ar.edu.unlp.objetos.oo2.ejercicio22_lineaDeProduccion;

public class LightMix extends ProcessStep{

	@Override
	protected boolean basicExecute(MixingTank tank) {
		double temp = tank.temperature();
		tank.heatPower(100);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (tank.temperature() - temp == 10) {
			tank.mixerPower(5);
			return true;
		}
		return false;
	}

}
