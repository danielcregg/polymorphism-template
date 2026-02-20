package ie.gmit.overriding;

/**
 * Triangle
 */
public class Triangle extends TwoDShape {

    public Triangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    @Override
    public double findArea() {
        double area;
        area = getWidth()/2 * getHeight();
        return area;
    }
    
}
