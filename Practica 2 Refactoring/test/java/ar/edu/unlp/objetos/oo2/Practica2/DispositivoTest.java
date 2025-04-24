package ar.edu.unlp.objetos.oo2.Practica2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ejercicio8.CRC16_Calculator;
import ejercicio8.CRC32_Calculator;
import ejercicio8.CuatroGConnAdapter;
import ejercicio8.Dispositivo;
import ejercicio8.WifiConn;

public class DispositivoTest {
	private Dispositivo dispo;
	private CRC16_Calculator calc16;
	private CRC32_Calculator calc32;
	private WifiConn wifi;
	private CuatroGConnAdapter cuatroG;
	
	@BeforeEach
	public void setUp() {
		dispo = new Dispositivo();
		calc16 = new CRC16_Calculator();
		calc32 = new CRC32_Calculator();
		wifi = new WifiConn();
		cuatroG = new CuatroGConnAdapter();
	}
	
	@Test
	public void testConectarCon() {
		assertEquals("WIFI",dispo.conectarCon(wifi));
		assertEquals("4G",dispo.conectarCon(cuatroG));
	}
	
	@Test
	public void testSendCRC16() {
		dispo.configurarCRC(calc16);
		dispo.conectarCon(wifi);
		String res = dispo.send("Hola mundo!");
		System.out.println(res);
		assertTrue(res.startsWith("Enviando datos por WIFI: Hola mundo!"));
		dispo.conectarCon(cuatroG);
		res = dispo.send("Hola mundo!");
		assertTrue(res.contains("Enviando datos por 4G: Hola mundo!"));
	}
	
	@Test
	public void testSendCRC32() {
		dispo.configurarCRC(calc32);
		dispo.conectarCon(wifi);
		String res = dispo.send("Hola mundo!");
		System.out.println(res);
		assertTrue(res.startsWith("Enviando datos por WIFI: Hola mundo!"));
		dispo.conectarCon(cuatroG);
		res = dispo.send("Hola mundo!");
		assertTrue(res.contains("Enviando datos por 4G: Hola mundo!"));
	}
	
	

}
