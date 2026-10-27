
package iteration_statements;

public class ForLoop {

    public static void main(String[] args) {

        // Basic For Loop
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // Calculate the Sum from 1 to 100
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        System.out.println("Sum: " + sum); // Output: Sum: 5050

        // Declare the Counter Outside the Loop
        int counter = 0;

        for (; counter < 3; counter++) {
            System.out.println("Counter: " + counter);
        }

        // Update the Counter Inside the Loop
        for (int i = 1; i <= 3;) {
            System.out.println("Number: " + i);
            i++;
        }

        // Use Multiple Counters
        for (int i = 0, j = 5; i < 5; i++, j--) {
            System.out.println("i = " + i + ", j = " + j);
        }

        // 6. Infinite Loop (Do Not Run Without a Stop Condition)
        // for (;;) {
        // System.out.println("Running forever");
        // }
    }
}
