
package exercises;

import java.util.Scanner;

/**
 * ----------------------
 * Area of Triangle
 * ---------------------
 *
 * Implement a console program which meets the following requirements:
 *
 * a. Program asks the user to enter three sides of a triangle
 * b. Program calculates the semi-perimeter of the triangle
 * c. Program calculates the area using Heron's formula
 * d. Program rounds the area up to the nearest integer
 * e. Program prints the calculated area to the console
 *
 * Example:
 * Input: 3, 4, 5
 * Output: Triangle area is: 6.0
 */
public class AreaOfTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter A side of a triangle: ");
        double a = sc.nextDouble();

        System.out.print("Please, enter B side of a triangle: ");
        double b = sc.nextDouble();

        System.out.print("Please, enter C side of a triangle: ");
        double c = sc.nextDouble();

        // Calculate the semi-perimeter
        double p = (a + b + c) / 2;

        // Calculate the area of Triangle (using Heron's formula)
        double triangleArea = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        // Print the result
        System.out.println("Triangle area is: " + Math.ceil(triangleArea));

        sc.close();
    }
}
