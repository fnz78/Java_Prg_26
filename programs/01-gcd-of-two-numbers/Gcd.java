import java.util.Scanner;

class Gcd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n1, n2, temp, gcd = 0, i = 1;

        System.out.print("Enter No1: ");
        n1 = sc.nextInt();

        System.out.print("Enter No2: ");
        n2 = sc.nextInt();

        if (n1 > n2) {
            temp = n1;
        } else {
            temp = n2;
        }

        while (i <= temp) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
            i++;
        }

        System.out.println("Gcd is: " + gcd);

        sc.close();
    }
}
