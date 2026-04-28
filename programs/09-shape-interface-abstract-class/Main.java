import java.util.Scanner;

// Interface
interface Shape {
    void display();
}

// Abstract class for 2D shapes
abstract class TwoDim implements Shape {
    abstract double area();
}

// Abstract class for 3D shapes
abstract class ThreeDim implements Shape {
    abstract double area();
    abstract double volume();
}

// Circle
class Circle extends TwoDim {
    double r;
    Circle(double r){ this.r = r; }

    public void display() {
        System.out.println("Circle");
    }

    double area() {
        return Math.PI * r * r;
    }
}

// Square
class Square extends TwoDim {
    double s;
    Square(double s){ this.s = s; }

    public void display() {
        System.out.println("Square");
    }

    double area() {
        return s * s;
    }
}

// Triangle
class Triangle extends TwoDim {
    double b,h;

    Triangle(double b,double h) {
        this.b = b;
        this.h = h;
    }

    public void display() {
        System.out.println("Triangle");
    }

    double area() {
        return 0.5 * b * h;
    }
}

// Sphere
class Sphere extends ThreeDim {
    double r;

    Sphere(double r) {
        this.r = r;
    }

    public void display() {
        System.out.println("Sphere");
    }

    double area() {
        return 4 * Math.PI * r * r;
    }

    double volume() {
        return (4.0/3) * Math.PI * r * r * r;
    }
}

// Cube
class Cube extends ThreeDim {
    double s;

    Cube(double s) {
        this.s = s;
    }

    public void display() {
        System.out.println("Cube");
    }

    double area() {
        return 6 * s * s;
    }

    double volume() {
        return s * s * s;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Shape shape;

        System.out.println("Choose Shape:");
        System.out.println("1.Circle  2.Square  3.Triangle  4.Sphere  5.Cube");

        int ch = sc.nextInt();

        switch(ch) {

            case 1:
                System.out.print("Enter radius: ");
                shape = new Circle(sc.nextDouble());
                shape.display();
                System.out.println("Area = " + ((Circle)shape).area());
                break;

            case 2:
                System.out.print("Enter side: ");
                shape = new Square(sc.nextDouble());
                shape.display();
                System.out.println("Area = " + ((Square)shape).area());
                break;

            case 3:
                System.out.print("Enter base: ");
                double b = sc.nextDouble();
                System.out.print("Enter height: ");
                double h = sc.nextDouble();

                shape = new Triangle(b,h);
                shape.display();
                System.out.println("Area = " + ((Triangle)shape).area());
                break;

            case 4:
                System.out.print("Enter radius: ");
                shape = new Sphere(sc.nextDouble());
                shape.display();
                System.out.println("Surface Area = " + ((Sphere)shape).area());
                System.out.println("Volume = " + ((Sphere)shape).volume());
                break;

            case 5:
                System.out.print("Enter side: ");
                shape = new Cube(sc.nextDouble());
                shape.display();
                System.out.println("Surface Area = " + ((Cube)shape).area());
                System.out.println("Volume = " + ((Cube)shape).volume());
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
