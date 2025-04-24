package ejercicio7;

public interface State {
	public void mas(Calculadora calcu);
	public void menos(Calculadora calcu); 	
	public void por(Calculadora calcu);
	public void dividido(Calculadora calcu); 
	public String resultado(Calculadora calcu); 
	public void setValue(Calculadora calcu, double value);
	public void borrar(Calculadora calcu);
}
