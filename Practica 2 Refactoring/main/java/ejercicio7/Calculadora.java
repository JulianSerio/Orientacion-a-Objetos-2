package ejercicio7;

public class Calculadora {
	private double acumulador;
	private State estado;
	
	public Calculadora() {
		estado = new Inicial();
	}
	
	public void setValue(double value) {
		estado.setValue(this, value);
	}
	
	public void mas() {
		estado.mas(this);
	}
		
	public void menos() {
		estado.menos(this);		
	}
	
	public void por() {
		estado.por(this);
	}
	
	public void dividido() {
		estado.dividido(this);
	}
	
	public String resultado() {
		return estado.resultado(this);
	}
	
	public void borrar() {
		estado.borrar(this);
	}
	
	public void sumarAcumulador(double valor) {
		this.acumulador += valor;
	}
	
	public void restarAcumulador(double value) {
		this.acumulador -= value;
	}
	
	public void dividirAcumulador(double value) {
		this.acumulador = acumulador / value;
	}
	
	public void multiplicarAcumulador(double value) {
		this.acumulador = acumulador * value;
	}
	
	public void reiniciarContador() {
		this.acumulador = 0;
	}
	
	public Double getAcumulador() {
		return this.acumulador;
	}
	
	public void setEstado(State state) {
		this.estado = state;
	}
	

}
