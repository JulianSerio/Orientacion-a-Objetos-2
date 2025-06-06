package ejercicio7;

public class Dividiendo implements State {

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
		if (value == 0) {
			calcu.setEstado(new ErrorState());
		}
		else {
			calcu.dividirAcumulador(value);
			calcu.setEstado(new Inicial()); 
		}
	}

	@Override
	public void borrar(Calculadora calcu) {
		calcu.reiniciarContador();
		calcu.setEstado(new Inicial());
	}
}
