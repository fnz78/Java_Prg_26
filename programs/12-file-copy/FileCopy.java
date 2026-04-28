import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Usage: java FileCopy sourceFile destinationFile");
            return;
        }

        FileInputStream fin = null;
        FileOutputStream fout = null;

        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            int ch;
            while ((ch = fin.read()) != -1) {
                fout.write(ch);
            }

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (fin != null) fin.close();
                if (fout != null) fout.close();
            } catch (IOException e) {
                System.out.println("Error closing files.");
            }
        }
    }
}
