package ejercicio7;

public class Restando implements State {

	@Override
	public void mas(Calculadora calcu) {
		calcu.setEstado(new ErrorState());
	}

	@Override
	public void menos(Calculadora calcu) {
		calcu.setEstado(new ErrorState());
	}

	@Override
	public void por(Calculadora calcu) {
		calcu.setEstado(new ErrorState());
	}

	@Override
	public void dividido(Calculadora calcu) {
		calcu.setEstado(new ErrorState());
	}

	@Override
	public String resultado(Calculadora calcu) {
	    calcu.setEstado(new ErrorState());
	    return "Error";
	}

	@Override
	public void setValue(Calculadora calcu, double value) {
		calcu.restarAcumulador(value);
		//no estaba volviendo al estado inicial dsp de la operacion por lo tanto al apretar otra operacion tiraba error
		calcu.setEstado(new Inicial()); 
	}

	@Override
	public void borrar(Calculadora calcu) {
		calcu.reiniciarContador();
		calcu.setEstado(new Inicial());
	}

}
