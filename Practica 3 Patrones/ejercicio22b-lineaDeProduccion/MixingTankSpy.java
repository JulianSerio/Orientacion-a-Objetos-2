package ar.edu.unlp.objetos.oo2.ejercicio22_lineaDeProduccion;

public class MixingTankSpy extends MixingTank {
    public boolean heatPowerCalled = false;
    public int heatPowerValue = -1;

    public boolean mixerPowerCalled = false;
    public int mixerPowerValue = -1;

    public boolean purgeCalled = false;

    private double initialTemp = 20.0;
    private double simulatedTemp = 30.0; // Simulamos que luego de calentar subió a 30º
    private boolean tempReadOnce = false;
    
    private boolean purgeCompleted = false;
    private boolean firstUpToCall = true;

    @Override
    public boolean heatPower(int porcentaje) {
        this.heatPowerCalled = true;
        this.heatPowerValue = porcentaje;
        return true;
    }

    @Override
    public boolean mixerPower(int porcentaje) {
        this.mixerPowerCalled = true;
        this.mixerPowerValue = porcentaje;
        return true;
    }

    @Override
    public boolean purge() {
        this.purgeCalled = true;
        this.purgeCompleted = true;
        return true;
    }

    @Override
    public double upTo() {
        if (firstUpToCall) {
            firstUpToCall = false;
            return 50.0; // simulamos que el tanque está lleno antes del purge
        }
        return purgeCompleted ? 0.0 : 50.0;
    }

    @Override
    public double temperature() {
        // Primera llamada devuelve 20°C, segunda llamada 30°C
        if (!tempReadOnce) {
            tempReadOnce = true;
            return initialTemp;
        } else {
            return simulatedTemp;
        }
    }
}
