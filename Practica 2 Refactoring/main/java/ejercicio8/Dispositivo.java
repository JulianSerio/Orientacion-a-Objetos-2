package ejercicio8;

public class Dispositivo {
	private Ringer ringer;
	private Strategy crcCalculator;
	private Connection connection;
	private Display display;
	
	public Dispositivo() {
		this.ringer = new Ringer();
		this.display = new Display();
		this.connection = new WifiConn();
		this.crcCalculator = new CRC16_Calculator();
	}

	public String send(String data) {
		long crc = this.crcCalculator.crcFor(data);
		return this.connection.sendData(data,crc);
	}
	
	public void configurarCRC(Strategy estrategia) {
		this.crcCalculator = estrategia;
	}
	
	public String conectarCon(Connection conn) {
		this.connection = conn;
		this.ringer.ring();
		return this.display.showBanner(conn.pict());
	}

}
