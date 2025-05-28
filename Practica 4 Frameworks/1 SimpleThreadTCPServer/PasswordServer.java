import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class PasswordServer extends SingleThreadTCPServer{
	
	@Override
	public void handleMessage(String message, PrintWriter out) {
	    if (!message.isEmpty()) {
	    	String[] partes = Arrays.stream(message.trim().split("\\s+"))
                    .filter(s -> !s.isEmpty())
                    .toArray(String[]::new);

	        if (partes.length != 3) {
	            out.println("Error: se esperaban 3 argumentos. Formato: <letras> <numeros> <especiales>");
	        }

	        String cadenaLetras = partes[0].trim();
	        String cadenaNumeros = partes[1].trim();
	        String cadenaEspeciales = partes[2].trim();

	        if (!cadenaLetras.matches("^[a-zA-Z]+$")) {
	            out.println("Error: el primer argumento debe contener solo letras (a-z, A-Z).");
	        } else if (!cadenaNumeros.matches("^[0-9]+$")) {
	            out.println("Error: el segundo argumento debe contener solo números (0-9).");
	        } else if (!cadenaEspeciales.matches("^[^a-zA-Z0-9]+$")) {
	            out.println("Error: el tercer argumento debe contener solo caracteres especiales.");
	        } else {
	            Random random = new Random();
	            StringBuilder password = new StringBuilder();

	            // Al menos una letra
	            password.append(cadenaLetras.charAt(random.nextInt(cadenaLetras.length())));

	            // Al menos un número
	            password.append(cadenaNumeros.charAt(random.nextInt(cadenaNumeros.length())));

	            // Exactamente un carácter especial
	            char especial = cadenaEspeciales.charAt(random.nextInt(cadenaEspeciales.length()));
	            password.append(especial);

	            // Rellenar hasta llegar a 8 caracteres
	            String letrasYNumeros = cadenaLetras + cadenaNumeros;
	            for (int i = 0; i < 5; i++) {
	                password.append(letrasYNumeros.charAt(random.nextInt(letrasYNumeros.length())));
	            }

	            // Mezclar
	            List<Character> chars = password.chars()
	                    .mapToObj(c -> (char) c)
	                    .collect(Collectors.toList());
	            Collections.shuffle(chars);
	            String resultado = chars.stream()
	                    .map(String::valueOf)
	                    .collect(Collectors.joining());

	            out.println("Contraseña generada: " + resultado);
	        }

	    } else {
	        out.println("Error: se esperaban 3 argumentos. Formato: <letras> <numeros> <especiales>");
	    }
	}
	
	

	@Override
	public boolean endSession(String message) {
		return message.equalsIgnoreCase("chau") || message.equalsIgnoreCase("CHAU");
	}
	
	public static void main(String[] args) {
		PasswordServer server = new PasswordServer();
		server.startLoop(args);
	}
}
