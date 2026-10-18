
package strings;

import java.util.Locale;

public class StringFormatting {
    public static void main(String[] args) {

        // --------------------------------------------
        // String.format()
        //
        // - Creates and returns a formatted String.
        // - %s represents a String value.
        // --------------------------------------------
        String name = "Andre";
        String greeting = "morning";

        String message = String.format(
                "Hello dear %s. Good %s.",
                name,
                greeting);

        System.out.println(message); // Hello dear Andre. Good morning.

        // --------------------------------------------
        // System.out.printf()
        //
        // - Prints formatted output directly.
        // - %d represents a decimal integer.
        // - %n inserts a platform-specific newline.
        // --------------------------------------------
        int age = 20;
        System.out.printf("Name: %s%n", name);
        System.out.printf("Age: %d%n", age);

        // --------------------------------------------
        // Common Format Specifiers
        //
        // - %s: String
        // - %d: Decimal integer
        // - %f: Floating-point number
        // - %b: Boolean
        // - %c: Character
        // --------------------------------------------
        String language = "Java";
        double score = 8.75;
        boolean isActive = true;
        char grade = 'A';

        System.out.printf("Language: %s%n", language);
        System.out.printf("Score: %f%n", score);
        System.out.printf("Active: %b%n", isActive);
        System.out.printf("Grade: %c%n", grade);

        // --------------------------------------------
        // Precision Formatting
        //
        // - Controls the number of decimal places.
        // - Does not modify the original value.
        // --------------------------------------------
        double pi = 3.14159;

        System.out.printf(Locale.US, "%.2f%n", pi); // 3.14
        System.out.printf(Locale.US, "%.3f%n", pi); // 3.142
        System.out.printf(Locale.US, "%.4f%n", pi); // 3.1416
        System.out.println(pi); // 3.14159

        // --------------------------------------------
        // Width and Alignment
        //
        // - %10s: Right-aligned, minimum width 10.
        // - %-10s: Left-aligned, minimum width 10.
        // --------------------------------------------
        System.out.printf("|%10s|%n", "Java"); // | Java|
        System.out.printf("|%-10s|%n", "Java"); // |Java |

        // --------------------------------------------
        // Zero Padding
        //
        // - %05d pads the number with leading zeros.
        // --------------------------------------------
        int number = 42;

        System.out.printf("|%5d|%n", number); // | 42|
        System.out.printf("|%05d|%n", number); // |00042|

        // --------------------------------------------
        // Hexadecimal and Octal Formatting
        //
        // - %x: Lowercase hexadecimal.
        // - %X: Uppercase hexadecimal.
        // - %o: Octal.
        // --------------------------------------------
        int value = 255;

        System.out.printf("%d%n", value); // 255
        System.out.printf("%x%n", value); // ff
        System.out.printf("%X%n", value); // FF
        System.out.printf("%o%n", value); // 377

        // --------------------------------------------
        // 8. Percentage and Newline
        //
        // - %% prints a literal percent sign.
        // - %n inserts a newline.
        // --------------------------------------------
        System.out.printf("Progress: %d%%%n", 75);
        // Progress: 75%

        // --------------------------------------------
        // 9. Extra Format Arguments
        //
        // - Unused arguments are ignored.
        // --------------------------------------------
        String result = String.format(
                "Hello %s",
                "Hau",
                20);

        System.out.println(result); // Hello Hau

        // --------------------------------------------
        // 10. Missing Format Arguments
        //
        // - Throws MissingFormatArgumentException.
        // --------------------------------------------
        // String invalid = String.format(
        // "Hello %s, age %d",
        // "Hau"
        // );

        // --------------------------------------------
        // 11. Locale-Specific Formatting
        //
        // - Locale affects decimal and grouping
        // separators in formatted numbers.
        // --------------------------------------------
        double price = 1234.56;

        System.out.printf(Locale.US, "%,.2f%n", price);
        // 1,234.56

        System.out.printf(Locale.GERMANY, "%,.2f%n", price);
        // 1.234,56
    }
}
