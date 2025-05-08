package ar.info.juego.Encriptador;

public class RC4Adapter implements Cifrador{
	private RC4 rc4;
	private String key;
	
	public RC4Adapter(String key) {
		this.key = key;
		rc4 = new RC4();
	}

	@Override
	public String cifrar(String mensaje) {
		return rc4.encriptar(mensaje, key);
	}

	@Override
	public String descifrar(String mensaje) {
		return rc4.desencriptar(mensaje, key);
	}

}
