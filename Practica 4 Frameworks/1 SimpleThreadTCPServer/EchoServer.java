
import java.io.PrintWriter;

public class EchoServer extends SingleThreadTCPServer {
   
	@Override
    public void handleMessage(String message, PrintWriter out) {
        out.println(message);
    }

	@Override
	public boolean endSession(String message) {
		return message.equalsIgnoreCase("bye");
	}
	
	
    public static void main(String[] args) {

        new EchoServer().startLoop(args);

    }

	
	

}