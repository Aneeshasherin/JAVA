import java.util.Scanner;

class co3p1 {

    double area(double r) {
        return Math.PI * r * r;
    }

    double area(double l, double b) {
        return l * b;
    }

    double area(float b, float h) {
        return 0.5 * b * h;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area obj = new Area();

        // Circle
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.println("Area of Circle = " + obj.area(r));

        // Rectangle
        System.out.print("Enter length: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();
        System.out.println("Area of Rectangle = " + obj.area(l, b));

        // Triangle
        System.out.print("Enter base: ");
        float base = sc.nextFloat();
        System.out.print("Enter height: ");
        float h = sc.nextFloat();
        System.out.println("Area of Triangle = " + obj.area(base, h));

        sc.close();
    }
}
