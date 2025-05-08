package ar.edu.unlp.objetos.oo2.ejercicio13_subteway;

public class Sandwich {
	private String pan;
	private String aderezo;
	private String adicional;
	private String principal;
	private double precioPrincipal;
	private double precioPan;
	private double precioAderezo;
	private double precioAdicional;
	
	public void setPrincipal(String principal, double precio) {
		this.principal = principal;
		this.precioPrincipal = precio;
	}

	public void setPan(String pan, double precio) {
		this.pan = pan;
		this.precioPan = precio;
	}
	public void setAderezo(String aderezo, double precio) {
		this.aderezo = aderezo;
		this.precioAderezo = precio;
	}
	public void setAdicional(String adicional, double precio) {
		this.adicional = adicional;
		this.precioAdicional = precio;
	}
	
	public double getPrecioTotal() {
		return this.precioAderezo + this.precioAdicional + this.precioPan + this.precioPrincipal;
	}
}
