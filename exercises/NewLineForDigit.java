package exercises;

import java.util.Scanner;

/**
 * --------------------------------
 * Print digits from new line
 * --------------------------------
 *
 * Implement a console program which meets the following requirements:
 *
 * a. Program starts and asks user to enter integer number
 * b. Program prints each digit from the new line
 * 
 * EXAMPLE:
 * Input: “12345”
 * Output:
 * 1
 * 2
 * 3
 * 4
 * 5
 */
public class NewLineForDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter any integer: ");
        String userInput = sc.nextLine();

        for (int i = 0; i < userInput.length(); ++i) {
            int digit = userInput.charAt(i) - '0';
            System.out.println(digit);
        }

        sc.close();
    }
}
