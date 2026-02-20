package ie.gmit.overriding;

public class TwoDShape {

    // Instance Variables
    private double width;
    private double height;

    // Getters and Setters
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Area method
    public double findArea() {
        return this.width * this.height;
    }

}
