package ie.gmit.overloading;

public class Calculator {

    public int add(int a, int b) {
        int sum;
        sum = a + b;
        System.out.println("I am the add method with 2 ints");
        return sum;
    }

    public int add(int a, int b, int c) {
        int sum;
        // Calculate sum of a, b and c here and store in sum.
        sum = a + b + c;
        System.out.println("I am the add method with 3 ints");
        return sum;
    }

    public double add(int a, double b) {
        double sum;
        // Calculate sum of a and b here and store in sum.
        sum = a + b;
        System.out.println("I am the add method with 1 int and 1 double");
        return sum;
    }

    public double add(double a, int b) {
        double sum;
        // Calculate sum of a and b here and store in sum.
        sum = a + b;
        System.out.println("I am the add method with 1 double and 1 int");
        return sum;
    }

    public int subtract(int a, int b) {
        int result;
        // Calculate subtraction of a minus b here and store in result.
        result = a - b;
        System.out.println("I am the subtract method with 2 ints");
        return result;
    }

    public double subtract(double a, double b) {
        double result;
        // Calculate subtraction of a minus b here and store in result.
        result = a - b;
        System.out.println("I am the subtract method with 2 doubles");
        return result;
    }
    
}
