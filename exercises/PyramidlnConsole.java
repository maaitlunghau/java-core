package exercises;

import java.util.Scanner;

/**
 * --------------------------------
 * Pyramid in console
 * --------------------------------
 *
 * Implement a console program which meets the following requirements:
 *
 * a. Program starts and asks user to enter the height of the pyramid.
 * b. Program draws such picture in console:
 * 
 * EXAMPLE:
 * *
 * **
 * ***
 * ****
 * ***
 * **
 * *
 * In example above the height of the pyramid is 4
 */
public class PyramidlnConsole {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter height of the pyramid: ");
        int height = sc.nextInt();

        for (int i = 1; i <= height; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = height - 1; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
