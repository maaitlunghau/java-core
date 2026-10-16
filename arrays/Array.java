package arrays;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        // --------------------------------------------
        // Array Declaration & Initialization
        //
        // - Array stores multiple elements of the same type.
        // - Array size is fixed after creation.
        // - Array index starts from 0.
        // --------------------------------------------
        // Declaration
        int[] numbers;

        // Initialization: array with 5 elements
        numbers = new int[5];
        for (int i = 0; i < numbers.length; ++i) {
            System.out.println(i);
        }

        // Declaration + Initialization
        int[] scores = { 10, 20, 30, 40, 50 };

        System.out.println("scores: " + Arrays.toString(scores));
        // [10, 20, 30, 40, 50]

        // --------------------------------------------
        // 2. Access, Update & Array Length
        //
        // - Access elements using index.
        // - Last index = array.length - 1
        // --------------------------------------------
        System.out.println("first: " + scores[0]); // 10
        System.out.println("last: " + scores[4]); // 50
        System.out.println("length: " + scores.length); // 5

        // Update element at index 1
        scores[1] = 99;
        System.out.println("updated: " + Arrays.toString(scores)); // [10, 99, 30, 40, 50]

        // --------------------------------------------
        // 3. Default Values in Arrays
        //
        // - Java automatically initializes array elements.
        // --------------------------------------------
        int[] integers = new int[3];
        double[] decimals = new double[3];
        boolean[] booleans = new boolean[3];
        String[] strings = new String[3];

        System.out.println("int: " + Arrays.toString(integers)); // [0, 0, 0]
        System.out.println("double: " + Arrays.toString(decimals)); // [0.0, 0.0, 0.0]
        System.out.println("boolean: " + Arrays.toString(booleans)); // [false, false, false]
        System.out.println("String: " + Arrays.toString(strings)); // [null, null, null]

        // --------------------------------------------
        // 4. ArrayIndexOutOfBoundsException
        //
        // - Occurs when accessing an invalid index.
        // - Valid indexes: 0 to array.length - 1
        // --------------------------------------------
        // System.out.println(scores[5]);
        // Runtime Exception: ArrayIndexOutOfBoundsException

        // --------------------------------------------
        // 5. Multidimensional Arrays (2D Arrays)
        //
        // - A multidimensional array is an array of arrays.
        // - Access elements using [row][column].
        // --------------------------------------------
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        System.out.println("matrix[0][0]: " + matrix[0][0]); // 1
        System.out.println("matrix[1][2]: " + matrix[1][2]); // 6

        // Print a 2D array
        System.out.println("matrix: " + Arrays.deepToString(matrix)); // [[1, 2, 3], [4, 5, 6]]

        // Create a 2D array with 2 rows and 3 columns
        int[][] matrix2 = new int[2][3];
        System.out.println("matrix2: " + Arrays.deepToString(matrix2)); // [[0, 0, 0], [0, 0, 0]]

        // Only initialize the outer array
        int[][] matrix3 = new int[2][];
        System.out.println("matrix3[0]: " + matrix3[0]); // null

        // --------------------------------------------
        // 6. Arrays Utility Class
        //
        // - Arrays.toString(): Print array elements.
        // - Arrays.sort(): Sort array elements.
        // --------------------------------------------
        int[] values = { 30, 10, 50, 20, 40 };

        System.out.println("before: " + Arrays.toString(values)); // [30, 10, 50, 20, 40]
        Arrays.sort(values);
        System.out.println("after: " + Arrays.toString(values)); // [10, 20, 30, 40, 50]
    }
}
