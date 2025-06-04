package ar.edu.unlp.objetos.oo2.ejercicio22_lineaDeProduccion;

public abstract class MixingTank {
    public abstract boolean heatPower(int porcentaje);
    public abstract boolean mixerPower(int porcentaje);
    public abstract boolean purge();
    public abstract double upTo();
    public abstract double temperature();
}
