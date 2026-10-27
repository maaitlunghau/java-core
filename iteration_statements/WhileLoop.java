
package iteration_statements;

public class WhileLoop {

    public static void main(String[] args) {

        // --------------------------------------------
        // Basic While Loop
        // - Repeats while the condition is true.
        // --------------------------------------------
        int count = 1;

        while (count <= 5) {
            System.out.println(count);
            count++;
        }

        // --------------------------------------------
        // Condition Is False Initially
        // - The loop body is skipped.
        // --------------------------------------------
        int number = 10;

        while (number < 5) {
            System.out.println("Inside loop");
        }

        System.out.println("After loop");

        // --------------------------------------------
        // Calculate a Total
        // - Simulates adding item prices.
        // - Stops when all items are processed.
        // --------------------------------------------
        int item = 1;
        double totalPrice = 0;

        while (item <= 3) {
            double price = 10.0 * item;

            totalPrice += price;
            item++;
        }

        System.out.println("Total price: " + totalPrice); // Total price: 60.0

        // --------------------------------------------
        // Infinite Loop

        // - Do not uncomment this block during
        // normal execution: it never stops.
        // --------------------------------------------
        // while (true) {
        // System.out.println("Running forever");
        // }
    }
}
