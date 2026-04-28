import java.util.Scanner;

public class StackOperation {
    int arr[];
    int top = -1;
    int size;
    Scanner sc = new Scanner(System.in);

    StackOperation(int n) {
        size = n;
        arr = new int[size];
    }

    void push() {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        System.out.print("Enter number to push: ");
        int num = sc.nextInt();
        arr[++top] = num;
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println("Popped: " + arr[top--]);
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Stack elements:");
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
