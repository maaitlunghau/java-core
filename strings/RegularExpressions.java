
package strings;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args) {

        // --------------------------------------------
        // Basic Regular Expression
        //
        // - \\d matches a digit.
        // - + means one or more occurrences.
        // --------------------------------------------
        String digits = "12345";
        String digitRegex = "\\d+";
        System.out.println(digits.matches(digitRegex)); // true

        // --------------------------------------------
        // Finding Gmail Addresses
        //
        // - Pattern compiles a regular expression.
        // - Matcher searches for matching text.

        // - find() checks for the next match.
        // - group() returns the matched text.
        // --------------------------------------------
        String text = "Contact hello@gmail.com or admin@yahoo.com";
        String gmailRegex = "[a-zA-Z0-9-]+@gmail\\.com";

        Pattern pattern = Pattern.compile(gmailRegex);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println(matcher.group()); // hello@gmail.com
        }

        // --------------------------------------------
        // Splitting Text into Sentences
        //
        // - [.!?] matches any listed punctuation.
        // - split() returns an array of Strings.
        // --------------------------------------------
        String paragraph = "Hello Java! How are you? I am fine.";
        String[] sentences = paragraph.split("[.!?]");
        System.out.println(Arrays.toString(sentences)); // [Hello Java, How are you, I am fine]

        // --------------------------------------------
        // Finding Multiple Matches
        //
        // - while loops through all matches.
        // --------------------------------------------
        String emails = "hau@gmail.com, an@gmail.com, test@yahoo.com";
        Matcher emailMatcher = pattern.matcher(emails);

        while (emailMatcher.find()) {
            System.out.println(emailMatcher.group());
            // hau@gmail.com
            // an@gmail.com
        }

        // --------------------------------------------
        // String Validation with matches()
        //
        // - matches() checks the entire String.
        // - \\d{10} requires exactly 10 digits.
        // --------------------------------------------
        String phone = "0123456789";

        boolean isValid = phone.matches("\\d{10}");
        System.out.println(isValid); // true

        // --------------------------------------------
        // Replacing Text with Regex
        //
        // - replaceAll() replaces matching patterns.
        // - \\s+ matches one or more whitespace chars.
        // --------------------------------------------
        String input = "Hello    Java   Core";
        String cleaned = input.replaceAll("\\s+", " ");
        System.out.println(cleaned); // Hello Java Core
    }
}
