package ar.info.juego.Encriptador;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MensajeroTest {
	private Mensajero men;
	private String key;
	private RC4Adapter rc4;
	private FeistelAdapter feistel;
	
	@BeforeEach
	void setUp() {
		men = new Mensajero();
		key = "LLAVEXD";
		rc4 = new RC4Adapter(key);
		feistel = new FeistelAdapter(key);
	}
	
	@Test
	void testCifrador() {
		String mensajeCifrado = feistel.cifrar("HOLA QUE TAL");
		String mensajeDescifrado = feistel.descifrar(mensajeCifrado);
		assertEquals("HOLA QUE TAL",mensajeDescifrado);
		
		mensajeCifrado = rc4.cifrar("HOLA QUE TAL");
		mensajeDescifrado = rc4.descifrar(mensajeCifrado);
		assertEquals("HOLA QUE TAL",mensajeDescifrado);

	}	

	@Test
	void testFuncionamiento() {
		men.setCifrador(feistel);
		men.enviar("Hola todo bien?");
		men.setCifrador(rc4);
		men.enviar("Hola todo bien?");
	}
}
