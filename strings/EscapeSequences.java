
package strings;

public class EscapeSequences {
    public static void main(String[] args) {

        // --------------------------------------------
        // Escape Double Quote (\")
        //
        // - Allows double quotes inside a String.
        // --------------------------------------------
        String book = "I am reading \"Effective Java\".";
        System.out.println(book); // I am reading "Effective Java".

        // --------------------------------------------
        // Escape Backslash (\\)
        //
        // - Represents a single backslash.
        // --------------------------------------------
        String path = "C:\\Users\\Hau\\Documents";
        System.out.println(path); // C:\Users\Hau\Documents

        // --------------------------------------------
        // Newline (\n)
        //
        // - Inserts a line break.
        // --------------------------------------------
        String message = "Hello Java\nWelcome to Java Core";
        System.out.println(message);
        // Hello Java
        // Welcome to Java Core

        // --------------------------------------------
        // 4. Horizontal Tab (\t)
        //
        // - Inserts a tab character.
        // --------------------------------------------
        String table = "Name\tAge\nHau\t20";
        System.out.println(table);

        // --------------------------------------------
        // Escape Single Quote (\')
        //
        // - Useful in character literals.
        // --------------------------------------------
        char singleQuote = '\'';
        System.out.println(singleQuote); // '

        // --------------------------------------------
        // Unicode Escape (\\uXXX)
        //
        // - Represents a Unicode character.
        // --------------------------------------------
        String copyright = "\u00A9";
        String euro = "\u20AC";
        System.out.println(copyright); // ©
        System.out.println(euro); // €

        // --------------------------------------------
        // Combining Escape Sequences
        //
        // - Multiple escape sequences in one String.
        // --------------------------------------------
        String info = "User Information:\n"
                + "\tName: \"Hau\"\n"
                + "\tPath: C:\\Users\\Hau";
        System.out.println(info);

        // --------------------------------------------
        // Text Blocks (Java 15+)
        //
        // - Allows writing multi-line Strings.
        // - Improves readability without using \n.
        // - Useful for JSON, SQL, and HTML content.
        // --------------------------------------------
        String textBlock = """
                Hello Java
                Welcome to Java Core
                Let's learn Strings!
                """;
        System.out.println(textBlock);
    }
}
