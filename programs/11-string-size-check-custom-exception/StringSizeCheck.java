import java.util.Scanner;

class MyExClass extends Exception {
    public MyExClass(String message) {
        super(message);
    }
}

public class StringSizeCheck {

    public static void checkString(String str) throws MyExClass {
        if (str.length() > 10) {
            throw new MyExClass("String too large");
        } else {
            System.out.println("String accepted: " + str);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        try {
            checkString(input);
        } catch (MyExClass e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        sc.close();
    }
}
