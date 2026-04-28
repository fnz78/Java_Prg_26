import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(5000);
            System.out.println("Server started. Waiting for client...");

            Socket s = ss.accept();
            System.out.println("Client connected.");

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(s.getInputStream()));
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);

            String msg;

            while ((msg = in.readLine()) != null) {
                System.out.println("Client says: " + msg);
                out.println("Echo: " + msg);

                if (msg.equalsIgnoreCase("exit"))
                    break;
            }

            s.close();
            ss.close();

            System.out.println("Server closed.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
