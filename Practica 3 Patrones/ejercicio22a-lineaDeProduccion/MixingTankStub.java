package ar.edu.unlp.objetos.oo2.ejercicio22_lineaDeProduccion;

public class MixingTankStub extends MixingTank{

	@Override
	public boolean heatPower(int porcentaje) {
		return true;
	}

	@Override
	public boolean mixerPower(int porcentaje) {
		return true;
	}

	@Override
	public boolean purge() {
		return true;
	}

	@Override
	public double upTo() {
		return 0;
	}

	@Override
	public double temperature() {
		return 0;
	}

}
