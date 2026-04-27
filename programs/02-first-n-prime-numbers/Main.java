import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter n prime nos: ");
        int n = s.nextInt();

        System.out.println("Prime nos are:");

        int j = 2;

        while (n != 0) {
            int c = 0;

            for (int i = 1; i <= j; i++) {
                if (j % i == 0) {
                    c++;
                }
            }

            if (c == 2) {
                System.out.println(j);
                n--;
            }

            j++;
        }

        s.close();
    }
}
