package ar.info.juego.Encriptador;

public class Mensajero {
	private Cifrador cifrador;
	
	public void setCifrador(Cifrador cif) {
		this.cifrador = cif;
	}
	
	public String enviar(String mensaje) {
		return this.cifrador.cifrar(mensaje);
	}

	public String descifrar(String mensaje) {
		return this.cifrador.descifrar(mensaje);
	}
}

