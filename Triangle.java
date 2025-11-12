// ----------------------------------------------------------
// Triangle.java - Exercise_11.1
// ----------------------------------------------------------
/*
 * This class models a triangle using three side lengths and
 * inherits color/filled behavior from GeometricObject.
 */

public class Triangle extends GeometricObject {

    // Sets sides fields default value to 1.0.
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    // No-arg constructor: creates a default triangle (1,1,1).
    // Calls super() to initialize GeometricObject defaults.
    public Triangle() {
        super();
    }

    // Constructor with specified sides.
    // This sets the three side fields from the value that was passed.
    public Triangle(double side1, double side2, double side3) {
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Getters for all three data fields.
    public double getSide1() { return side1; }
    public double getSide2() { return side2; }
    public double getSide3() { return side3; }

    // getArea(): Uses Heron's formula to compute area:
    //   s = (a + b + c) / 2
    //   area = sqrt(s (s - a) (s - b) (s - c))
    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // getPerimeter(): returns a for sum the three sides.
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // toString(): exercise format
    // Overriding ensures this replaces Object.toString().
    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 +
                " side3 = " + side3;
    }
}