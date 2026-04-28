import java.util.Scanner;

public class TimeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter time 1:");
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int s1 = sc.nextInt();

        Time t1 = new Time(h1, m1, s1);

        System.out.println("Enter time 2:");
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int s2 = sc.nextInt();

        Time t2 = new Time(h2, m2, s2);

        Time sum = t1.add(t2);

        System.out.println("\nTime 1:");
        t1.display();

        System.out.println("Time 2:");
        t2.display();

        System.out.println("Sum of time:");
        sum.display();

        sc.close();
    }
          }
