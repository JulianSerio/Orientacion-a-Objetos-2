package ejercicio8;

public class CuatroGConnection {
	private String symb = "4G";
	
	public CuatroGConnection() {
	}

	public String transmit(String data, long crc) {
		return "Enviando datos por 4G: " + data + " con CRC: " + crc;
	}
	
	public String symb() {
		return this.symb;
	}

}
