package exercises;

import java.util.Scanner;

/**
 * -------------------------------
 * Calculate Amount of Words
 * -------------------------------
 *
 * Implement a console program which meets the following requirements:
 *
 * a. Program starts and asks user to enter text.
 * b. Program calls specific function which take one parameter of String type
 * and returns amount of words in the text.
 * 
 * Method should look like this:
 * public static int getWordsAmount(String text) {
 * <write your code here>
 * }
 * 
 * c. Program prints amount of words to the console.
 *
 * Example:
 * Input: Mai Trung Hau
 * Output: 3
 */
public class AmountOfWords {

    public static int getWordsAmount(String text) {
        text = text.trim();
        if (text.isEmpty()) {
            return 0;
        }

        int amountOfWords = 0;
        boolean insideWord = false;

        for (char c : text.toCharArray()) {
            if (Character.isWhitespace(c)) {
                insideWord = false;
            } else if (!insideWord) {
                amountOfWords++;
                insideWord = true;
            }
        }

        return amountOfWords;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter any text: ");
        String text = sc.nextLine();

        int amountOfWords = getWordsAmount(text);
        System.out.println("Amount of words in your text: " + amountOfWords);

        sc.close();
    }
}
