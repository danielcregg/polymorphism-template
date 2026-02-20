import ie.gmit.overloading.*;
import ie.gmit.overriding.*;

public class Main {

    public static void main(String[] args) {
        // Demonstrate method overloading
        System.out.println("=== Method Overloading (Calculator) ===");
        Calculator calc = new Calculator();
        System.out.println("add(2, 3) = " + calc.add(2, 3));
        System.out.println("add(2, 3, 4) = " + calc.add(2, 3, 4));
        System.out.println("add(2, 3.5) = " + calc.add(2, 3.5));
        System.out.println("add(3.5, 2) = " + calc.add(3.5, 2));
        System.out.println("subtract(10, 4) = " + calc.subtract(10, 4));
        System.out.println("subtract(10.5, 4.2) = " + calc.subtract(10.5, 4.2));

        // Demonstrate method overriding
        System.out.println("\n=== Method Overriding (Shapes) ===");
        TwoDShape rectangle = new TwoDShape();
        rectangle.setWidth(5);
        rectangle.setHeight(3);
        System.out.println("Rectangle area: " + rectangle.findArea());

        Triangle triangle = new Triangle(5, 3);
        System.out.println("Triangle area: " + triangle.findArea());

        Circle circle = new Circle(10, 10);
        System.out.println("Circle area: " + circle.findArea());
    }

} // End class
