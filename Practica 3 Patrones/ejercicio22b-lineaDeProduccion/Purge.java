package ar.edu.unlp.objetos.oo2.ejercicio22_lineaDeProduccion;

public class Purge extends ProcessStep {

	@Override
	protected boolean basicExecute(MixingTank tank) {
		if (tank.upTo() == 0) return false;
		tank.heatPower(0);
		tank.mixerPower(0);
		tank.purge();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (tank.upTo() != 0) return false;
		return true;
	}

}
