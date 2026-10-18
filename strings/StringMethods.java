package strings;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        // --------------------------------------------
        // String Object Creation
        // --------------------------------------------
        String text = "  Hello Java  ";

        // --------------------------------------------
        // Basic String Methods
        // --------------------------------------------
        System.out.println(text.length()); // 14
        System.out.println(text.contains("Java")); // true
        System.out.println(text.isEmpty()); // false
        System.out.println(text.toUpperCase()); // " HELLO JAVA "
        System.out.println(text.toLowerCase()); // " hello java "

        // --------------------------------------------
        // startsWith() and endsWith()
        // --------------------------------------------
        System.out.println(text.startsWith("H")); // false
        System.out.println(text.endsWith(" ")); // true

        // --------------------------------------------
        // replace()
        // --------------------------------------------
        String replaced = text.replace("Java", "World");
        System.out.println(replaced); // " Hello World "

        // --------------------------------------------
        // trim() and strip()
        // --------------------------------------------
        System.out.println(text.trim()); // "Hello Java"
        System.out.println(text.strip()); // "Hello Java"

        // --------------------------------------------
        // substring()
        //
        // - beginIndex: inclusive
        // - endIndex: exclusive
        // --------------------------------------------
        String word = "Hello Java";
        System.out.println(word.substring(0, 5)); // Hello
        System.out.println(word.substring(6)); // Java

        // --------------------------------------------
        // charAt() and toCharArray()
        // --------------------------------------------
        System.out.println(word.charAt(0)); // H

        char[] chars = word.toCharArray();
        System.out.println(Arrays.toString(chars));

        // --------------------------------------------
        // getBytes()
        //
        // - Converts String to a byte array.
        // --------------------------------------------
        byte[] bytes = word.getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(bytes));

        // --------------------------------------------
        // split()
        //
        // - Splits String using a regular expression.
        // --------------------------------------------
        String names = "Hau,An,Binh";
        String[] users = names.split(",");
        System.out.println(Arrays.toString(users)); // [Hau, An, Binh]

        // --------------------------------------------
        // String Immutability
        //
        // - String objects cannot be modified.
        // - Methods return a String result.
        // --------------------------------------------
        String message = "hello";

        message.toUpperCase();
        System.out.println(message); // hello

        message = message.toUpperCase();
        System.out.println(message); // HELLO
    }
}
