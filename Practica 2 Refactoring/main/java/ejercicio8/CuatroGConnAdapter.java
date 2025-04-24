package ejercicio8;

public class CuatroGConnAdapter implements Connection {
	private CuatroGConnection cuatroG;
	private String pict;
	
	public CuatroGConnAdapter() {
		this.cuatroG = new CuatroGConnection();
	}
	
	@Override
	public String sendData(String data, long crc) {
		return this.cuatroG.transmit(data, crc);
	}

	@Override
	public String pict() {
		return this.cuatroG.symb();
	}

}
