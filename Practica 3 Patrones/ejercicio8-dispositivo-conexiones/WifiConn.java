package ejercicio8;

public class WifiConn implements Connection{
	private String pict = "WIFI";

	@Override
	public String sendData(String data, long crc) {
		return "Enviando datos por WIFI: " + data + " con CRC " + crc;
	}

	@Override
	public String pict() {
		return pict;
	}

}
