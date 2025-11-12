// ----------------------------------------------------------
// TestTriangle.java
// ----------------------------------------------------------
/*
 * This driver program prompts the user for:
 *  three sides (double)
 * a color (String)
 * a boolean "filled" value
 * Then creates a Triangle, sets color via inherited setters,
 * and displays area, perimeter, color, and filled.
 */

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for three sides.
        System.out.print("Enter three sides of the triangle: ");
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();

        // Prompt user for color.
        System.out.print("Enter a color: ");
        String color = input.next();

        // Prompt user for filled flag (boolean).
        System.out.print("Is the triangle filled (true/false)? ");
        boolean filled = input.nextBoolean();

        // Construct Triangle with the given sides
        Triangle t = new Triangle(s1, s2, s3);

        // Set inherited properties
        t.setColor(color);
        t.setFilled(filled);

        // Display results: area, perimeter, color, and whether it is filled
        System.out.println();
        System.out.println(t.toString());
        System.out.println("Area: " + t.getArea());
        System.out.println("Perimeter: " + t.getPerimeter());
        System.out.println("Color: " + t.getColor());
        System.out.println("Filled: " + t.isFilled());

        input.close();
    }
}