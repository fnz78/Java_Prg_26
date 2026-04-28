import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 5000);

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(s.getInputStream()));
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);

            Scanner sc = new Scanner(System.in);
            String msg;

            while (true) {
                System.out.print("Enter message: ");
                msg = sc.nextLine();

                out.println(msg);

                String reply = in.readLine();
                System.out.println(reply);

                if (msg.equalsIgnoreCase("exit"))
                    break;
            }

            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
