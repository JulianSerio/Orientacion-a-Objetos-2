package ar.edu.unlp.objetos.oo2.ejercicio22_lineaDeProduccion;

public abstract class ProcessStep {
	private boolean result;
	
	public void execute(MixingTank tank) {
		if (this.basicExecute(tank)) {
			this.setSuccess();
		}
		else this.setFailure();
	}

	protected abstract boolean basicExecute(MixingTank tank);
	
	public boolean isDone() {
		return result;
	}

	private void setFailure() {
		this.result = false;
	}

	private void setSuccess() {
		this.result = true;
	}
	
}
