import java.util.Scanner;

interface Shape {
    double area();
}

class Rectangle implements Shape {
    double l, b;
    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }
    public double area() {
        return l * b;
    }
}

class Circle implements Shape {
    double r;
    Circle(double r) {
        this.r = r;
    }
    public double area() {
        return Math.PI * r * r;
    }
}

public class co4p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length and breadth: ");
        Rectangle r = new Rectangle(sc.nextDouble(), sc.nextDouble());

        System.out.print("Enter radius: ");
        Circle c = new Circle(sc.nextDouble());

        System.out.println("Rectangle Area: " + r.area());
        System.out.println("Circle Area: " + c.area());
    }
}
