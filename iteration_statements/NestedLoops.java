
package iteration_statements;

public class NestedLoops {

    public static void main(String[] args) {
        // Basic Nested Loops
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("i = " + i + ", j = " + j);
            }
        }

        // Print a Rectangle of Asterisks
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        // Output:
        // * * * *
        // * * * *
        // * * * *

        // Iterate Over a Two-Dimensional Array
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
        // Output:
        // 1 2 3
        // 4 5 6
        // 7 8 9
    }
}
