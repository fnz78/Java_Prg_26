import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countEven = 0;
        int countOdd = 0;
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {

            if (array[i] == 0) {
                countZero++;
            } else {
                if (array[i] > 0) {
                    countPositive++;
                } else {
                    countNegative++;
                }

                if (array[i] % 2 == 0) {
                    countEven++;
                } else {
                    countOdd++;
                }
            }
        }

        System.out.println("Count of even numbers     : " + countEven);
        System.out.println("Count of odd numbers      : " + countOdd);
        System.out.println("Count of positive numbers : " + countPositive);
        System.out.println("Count of negative numbers : " + countNegative);
        System.out.println("Count of zeros            : " + countZero);

        sc.close();
    }
}
