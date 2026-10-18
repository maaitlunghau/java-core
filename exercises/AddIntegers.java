
package exercises;

/**
 * ------------------
 * Add Integers
 * ------------------
 *
 * Implement a console program which meets the following requirements:
 *
 * a. Program accepts two integers as command-line arguments
 * b. Program converts the arguments from strings to integers
 * c. Program calculates the sum of the two integers
 * d. Program prints the sum to the console
 *
 * Example:
 * Command: java AddIntegers.java 10 20
 * Output: Sum: 30
 */
public class AddIntegers {

    public static void main(String[] args) {
        // Parse command-line arguments to integers
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        // Calculate the sum
        int sum = num1 + num2;

        // Print the result
        System.out.println("Sum: " + sum);
    }
}
