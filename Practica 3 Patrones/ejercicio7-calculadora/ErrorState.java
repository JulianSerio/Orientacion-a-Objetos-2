package ejercicio7;

public class ErrorState implements State {

	@Override
	public void mas(Calculadora calcu) {	
	}

	@Override
	public void menos(Calculadora calcu) {	
	}

	@Override
	public void por(Calculadora calcu) {
	}

	@Override
	public void dividido(Calculadora calcu) {		
	}

	@Override
	public String resultado(Calculadora calcu) {
		return "Error";
	}

	@Override
	public void setValue(Calculadora calcu, double value) {	
	}

	@Override
	public void borrar(Calculadora calcu) {
		calcu.reiniciarContador();
		calcu.setEstado(new Inicial());
	}
}
