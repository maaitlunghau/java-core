
package iteration_statements;

import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {

        // Basic Do-While Loop
        int counter = 1;

        do {
            System.out.println(counter);
            counter++;
        } while (counter <= 5);

        // Output:
        // 1
        // 2
        // 3
        // 4
        // 5

        // Do-While Executes At Least Once
        int number = 5;

        do {
            System.out.println("Number: " + number);
        } while (number < 5);

        // Output:
        // Number: 5

        // Calculate a Total
        int item = 1;
        double totalPrice = 0;

        do {
            double price = 10.0 * item;
            totalPrice += price;
            item++;
        } while (item <= 3);

        System.out.println("Total price: " + totalPrice);

        // Output:
        // Total price: 60.0

        // ATM PIN Validation
        Scanner scanner = new Scanner(System.in);

        final String correctPin = "1234";
        String pin;

        do {
            System.out.print("Enter your PIN: ");
            pin = scanner.nextLine();

            if (!pin.equals(correctPin)) {
                System.out.println("Invalid PIN. Try again.");
            }
        } while (!pin.equals(correctPin));

        System.out.println("PIN accepted.");

        scanner.close();

        // Example output:
        // Enter your PIN: 0000
        // Invalid PIN. Try again.
        // Enter your PIN: 1234
        // PIN accepted.
    }
}
