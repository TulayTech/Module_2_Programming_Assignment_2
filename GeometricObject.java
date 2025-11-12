// ----------------------------------------------------------
// GeometricObject.java from Exercise_11.1
// ----------------------------------------------------------
/*
 * Abstract base class that defines shared fields and behaviors
 * for geometric shapes (like Triangle, Circle, etc.)
 */
// ----------------------------------------------------------

public abstract class GeometricObject {
    private String color = "white";
    private boolean filled;

    /** Default constructor (creates white, unfilled object) */
    protected GeometricObject() {
    }

    /** Construct a geometric object with specified color/filled */
    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /** Getter method for color */
    public String getColor() {
        return color;
    }

    /** Setter method for color */
    public void setColor(String color) {
        this.color = color;
    }

    /** Getter method for filled (boolean uses "is" prefix) */
    public boolean isFilled() {
        return filled;
    }

    /** Setter method for filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Abstract method getArea (must be implemented by subclass) */
    public abstract double getArea();

    /** Abstract method getPerimeter (must be implemented by subclass) */
    public abstract double getPerimeter();
}