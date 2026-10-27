package exercises;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ----------------------
 * Find max int in array
 * ---------------------
 *
 * Implement a console program which meets the following requirements:
 *
 * a. Program starts and asks user to input integer numbers separated by space.
 * b. Program creates array object with entered numbers.
 * c. Program calls specific method which takes int[] as an parameter and
 * returns max value in this array.
 *
 * Example:
 * Input: 1 2 3 4 11
 * Output: 11
 */
public class FindMaxInt {

    public static int findMaxIntInArray(int[] intArray) {
        int max = intArray[0];

        for (int num : intArray) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter integer numbers separated by space: ");
        String userInput = scanner.nextLine();
        String[] stringArray = userInput.split(" ");

        // Convert string array to int array
        // Approach 01 (using for loop)
        // int[] intArray = new int[stringArray.length];
        // for (int i = 0; i < intArray.length; ++i) {
        // intArray[i] = Integer.parseInt(stringArray[i]);
        // }

        // Approach 02 (using Stream)
        int[] intArray = Arrays.stream(stringArray)
                .mapToInt(Integer::parseInt)
                .toArray();

        int maxInt = findMaxIntInArray(intArray);
        System.out.println("Max int in array: " + maxInt);

        scanner.close();
    }
}
