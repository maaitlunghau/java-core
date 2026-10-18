package exercises;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ------------------
 * Split Words
 * ------------------
 * 
 * Implement console program which meet the following requirements:
 *
 * a. Program starts and asks user to input any text
 * b. Program prints array of words entered by user without any spaces or
 * punctuation marks
 */
public class SplitWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any text: ");
        String text = sc.nextLine();

        // Approach 01 (using split() method)
        String[] splitText = text.split("");
        System.out.println("You entered those words: " + Arrays.toString(splitText));

        // Approach 02 (using toCharArray() method)
        char[] charArr = text.toCharArray();
        System.out.println("You entered those words: " + Arrays.toString(charArr));

        // Aproach 03 (follow exercise topic)
        String[] words = text.split("[^\\p{L}\\p{N}]+");
        System.out.println("You entered those words: " + Arrays.toString(words));

        sc.close();
    }
}
