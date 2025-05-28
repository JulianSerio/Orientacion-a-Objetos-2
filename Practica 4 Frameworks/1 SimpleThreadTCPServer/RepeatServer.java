import java.io.PrintWriter;
import java.util.Arrays;

public class RepeatServer extends SingleThreadTCPServer {

	@Override
	public void handleMessage(String message, PrintWriter out) {
		if (!message.isEmpty()) {
			String[] partes = Arrays.stream(message.trim().split("\\s+"))
					.filter(s -> !s.isEmpty())
	                .toArray(String[]::new);
			
			if (partes.length < 2 || partes.length > 3) {
                out.println("Error: se esperaban 2 o 3 argumentos. Formato: <cadena> <cantidad> <caracter (opcional)>");
                return;
			}
		    String cadenaRepetir = partes[0];
		    if(cadenaRepetir.isBlank()) out.println("Error: El Primer arguemento no puede ser nulo o vacio");
		    
		    int cantVeces;
            try {
                cantVeces = Integer.parseInt(partes[1]);
                if (cantVeces <= 0) {
                    out.println("Error: el segundo argumento debe ser un número mayor a 0.");
                    return;
                }
            } catch (NumberFormatException e) {
                out.println("Error: el segundo argumento debe ser un número entero.");
                return;
            }
		    
		    String cadenaEspeciales = "";
		    if (partes.length == 3) 
		    	if (!partes[2].isBlank())
		    		cadenaEspeciales = partes[2];
		    	else out.println("Error: el tercer argumento esta vacio.");
		    	
		    
		   String cadenaConChar = cadenaRepetir + cadenaEspeciales;
		   out.println("Cadena "+partes[0]);
		   out.println("Veces "+partes[1]);
		   if (partes.length == 3)out.println("Char "+partes[2]);
		   out.println(cadenaConChar.repeat(cantVeces));
		}
		else out.println("Error: se esperaban 2 argumentos. Formato: <letras> <numeros> <especiales>");
	}

	@Override
	public boolean endSession(String message) {
		return message.equalsIgnoreCase("chau") || message.equalsIgnoreCase("CHAU");
	}
	
	public static void main (String[] args) {
		RepeatServer server = new RepeatServer();
		server.startLoop(args);
	}

}
