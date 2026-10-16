package exercises;

public class AddIntegers {

    // Statement to run: java AddIntegers.java 10 20
    // - 10: args[0]
    // - 20: args[1]

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
