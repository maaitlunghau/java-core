package exercises;

import java.util.Scanner;

/**
 * -------------------------
 * Draw empty rectangle
 * -------------------------
 *
 * Implement a console program which meets the following requirements:
 *
 * a. Program starts and asks user to input height of the rectangle
 * b. After user inputs heights of the rectangle, program asks to input width of
 * the rectangle.
 * c. Program calls specific method which takes two parameters of int type which
 * prints rectangle to the console:
 */
public class EmptyRectangle {
    public static void drawRectangle(int height, int width) {
        for (int i = 1; i <= height; ++i) {
            for (int j = 1; j <= width; ++j) {
                if (i == 1 || i == height || j == 1 || j == width) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter height of rectangle: ");
        int height = sc.nextInt();
        System.out.print("Please, enter width of rectangle: ");
        int width = sc.nextInt();

        drawRectangle(height, width);

        sc.close();
    }
}
