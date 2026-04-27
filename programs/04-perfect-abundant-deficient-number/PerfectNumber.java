import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        if (sum == n) {
            System.out.println(n + " is a Perfect Number");
        } else if (sum > n) {
            System.out.println(n + " is an Abundant Number");
        } else {
            System.out.println(n + " is a Deficient Number");
        }

        sc.close();
    }
}
