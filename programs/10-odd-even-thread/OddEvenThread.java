package addeventhread;

import java.util.Scanner;

public class OddEvenThread {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int n = sc.nextInt();

        OddThread obj1 = new OddThread(n);
        EvenThread obj2 = new EvenThread(n);

        obj1.start();
        obj2.start();

        System.out.println("Application ends");
    }
}
