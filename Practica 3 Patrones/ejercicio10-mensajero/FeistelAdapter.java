package ar.info.juego.Encriptador;

public class FeistelAdapter implements Cifrador {
	private FeistelCipher fp;
	private String key;
	
	public FeistelAdapter(String key) {
		this.key = key;
		fp = new FeistelCipher(key);
	}

	@Override
	public String cifrar(String mensaje) {
		return fp.encode(mensaje);
	}

	@Override
	public String descifrar(String mensaje) {
		return fp.encode(mensaje);
	}

}
