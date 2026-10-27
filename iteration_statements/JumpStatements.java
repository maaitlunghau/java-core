
package iteration_statements;

public class JumpStatements {

    public static void main(String[] args) {

        // Continue: Print Only Odd Numbers
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }

            System.out.println(i);
        }

        // Break: Stop When i Equals 3
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }

            System.out.println("i = " + i);
        }

        // Break: Find a Target in an Array
        int[] numbers = { 10, 20, 30, 40, 50 };
        int target = 30;

        for (int number : numbers) {
            if (number == target) {
                System.out.println("Target found: " + number);
                break;
            }
        }

        // Break in Nested Loops
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 3) {
                    break;
                }

                System.out.println("i = " + i + ", j = " + j);
            }

            System.out.println("Outer loop: " + i);
        }
    }
}
