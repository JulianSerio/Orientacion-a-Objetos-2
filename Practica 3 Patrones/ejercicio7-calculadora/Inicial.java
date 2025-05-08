package ejercicio7;

public class Inicial implements State {

	@Override
	public void mas(Calculadora calcu) {
		calcu.setEstado(new Sumando());
	}

	@Override
	public void menos(Calculadora calcu) {
		calcu.setEstado(new Restando());
	}

	@Override
	public void por(Calculadora calcu) {
		calcu.setEstado(new Multiplicando());
	}

	@Override
	public void dividido(Calculadora calcu) {
		calcu.setEstado(new Dividiendo());
	}

	@Override
	public String resultado(Calculadora calcu) {
		return calcu.getAcumulador().toString();
	}

	@Override
	public void setValue(Calculadora calcu, double value) {
		calcu.sumarAcumulador(value);
	}

	@Override
	public void borrar(Calculadora calcu) {
		calcu.reiniciarContador();
	}
	
	

}
