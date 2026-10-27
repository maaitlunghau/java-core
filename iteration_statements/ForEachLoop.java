
package iteration_statements;

public class ForEachLoop {

    public static void main(String[] args) {
        // Iterate Over an Array
        int[] numbers = { 10, 20, 30, 40, 50 };

        for (int number : numbers) {
            System.out.println(number);
        }

        // Calculate the Sum of Array Elements
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Sum: " + sum); // Output: Sum: 150

        // Find the Maximum Value
        int max = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        System.out.println("Maximum: " + max); // Output: Maximum: 50

        // Stop the Loop Early with Break
        for (int number : numbers) {
            if (number == 30) {
                break;
            }

            System.out.println(number);
        }
        // Output:
        // 10
        // 20
    }
}
