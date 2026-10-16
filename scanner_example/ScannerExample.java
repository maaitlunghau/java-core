package scanner_example;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // --------------------------------------------
        // Reading String Input
        //
        // - next() reads a single token.
        // --------------------------------------------
        System.out.print("Enter your name: ");
        String name = scanner.next();

        // --------------------------------------------
        // Reading Integer Input
        //
        // - nextInt() reads an integer value.
        // --------------------------------------------
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // --------------------------------------------
        // Reading Double Input
        //
        // - nextDouble() reads a decimal number.
        // --------------------------------------------
        System.out.print("Enter your height (meters): ");
        double height = scanner.nextDouble();

        // --------------------------------------------
        // Displaying User Information
        // --------------------------------------------
        System.out.println("\n--- User Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);

        // --------------------------------------------
        // Closing Scanner
        //
        // - Release the input resource.
        // --------------------------------------------
        scanner.close();
    }
}