
package methods;

public class RecursiveMethods {

    // Recursive Factorial
    private static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative integers.");
        }

        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    // Iterative Factorial
    private static long factorialIterative(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative integers.");
        }

        long result = 1;

        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    // Recursive Countdown
    private static void countDown(int n) {
        if (n <= 0) {
            return;
        }

        System.out.println(n);
        countDown(n - 1);
    }

    public static void main(String[] args) {

        // Calculate Factorial Using Recursion
        System.out.println("Factorial of 3: " + factorial(3)); // Output: Factorial of 3: 6
        System.out.println("Factorial of 4: " + factorial(4)); // Output: Factorial of 4: 24
        System.out.println("Factorial of 0: " + factorial(0)); // Output: Factorial of 0: 1

        // Calculate Factorial Using Iteration
        System.out.println("Iterative factorial of 4: " + factorialIterative(4));
        // Output: Iterative factorial of 4: 24

        // 3. Count Down Using Recursion
        countDown(3);
        // Output:
        // 3
        // 2
        // 1
    }
}
