import java.util.Scanner;

// Base class Shape
class Shape {
    public void display() {
        System.out.println("This is a shape.");
    }
}

// Subclass TwoDim
class TwoDim extends Shape {
    public double area() {
        return 0.0;
    }
}

// Subclass ThreeDim
class ThreeDim extends Shape {
    public double area() {
        return 0.0;
    }
    public double volume() {
        return 0.0;
    }
}

// Circle
class Circle extends TwoDim {
    double r;
    Circle(double r){ this.r = r; }
    public void display(){ System.out.println("Circle"); }
    public double area(){ return Math.PI*r*r; }
}

// Square
class Square extends TwoDim {
    double s;
    Square(double s){ this.s = s; }
    public void display(){ System.out.println("Square"); }
    public double area(){ return s*s; }
}

// Triangle
class Triangle extends TwoDim {
    double b,h;
    Triangle(double b,double h){ this.b=b; this.h=h; }
    public void display(){ System.out.println("Triangle"); }
    public double area(){ return 0.5*b*h; }
}

// Sphere
class Sphere extends ThreeDim {
    double r;
    Sphere(double r){ this.r=r; }
    public void display(){ System.out.println("Sphere"); }
    public double area(){ return 4*Math.PI*r*r; }
    public double volume(){ return (4.0/3)*Math.PI*r*r*r; }
}

// Cube
class Cube extends ThreeDim {
    double s;
    Cube(double s){ this.s=s; }
    public void display(){ System.out.println("Cube"); }
    public double area(){ return 6*s*s; }
    public double volume(){ return s*s*s; }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Shape shape;

        System.out.println("Choose Shape:");
        System.out.println("1.Circle  2.Square  3.Triangle  4.Sphere  5.Cube");
        int ch = sc.nextInt();

        switch(ch){

            case 1:
                System.out.print("Enter radius: ");
                shape = new Circle(sc.nextDouble());
                shape.display();
                System.out.println("Area = "+((TwoDim)shape).area());
                break;

            case 2:
                System.out.print("Enter side: ");
                shape = new Square(sc.nextDouble());
                shape.display();
                System.out.println("Area = "+((TwoDim)shape).area());
                break;

            case 3:
                System.out.print("Enter base: ");
                double b = sc.nextDouble();
                System.out.print("Enter height: ");
                double h = sc.nextDouble();
                shape = new Triangle(b,h);
                shape.display();
                System.out.println("Area = "+((TwoDim)shape).area());
                break;

            case 4:
                System.out.print("Enter radius: ");
                shape = new Sphere(sc.nextDouble());
                shape.display();
                System.out.println("Surface Area = "+((ThreeDim)shape).area());
                System.out.println("Volume = "+((ThreeDim)shape).volume());
                break;

            case 5:
                System.out.print("Enter side: ");
                shape = new Cube(sc.nextDouble());
                shape.display();
                System.out.println("Surface Area = "+((ThreeDim)shape).area());
                System.out.println("Volume = "+((ThreeDim)shape).volume());
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}  output
