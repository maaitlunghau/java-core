package strings;

import java.util.Objects;

public class StringComparison {

    public static void main(String[] args) {
        // --------------------------------------------
        // String Literal and String Pool
        //
        // - Identical String literals share the
        // same object in the String Pool.
        // --------------------------------------------
        String s1 = "Java";
        String s2 = "Java";
        System.out.println(s1 == s2); // true

        // --------------------------------------------
        // Creating String with new
        //
        // - new String() creates a separate object.
        // - == compares object references.
        // --------------------------------------------
        String s3 = new String("Java");
        System.out.println(s1 == s3); // false

        // --------------------------------------------
        // equals()
        //
        // - Compares String contents.
        // --------------------------------------------
        System.out.println(s1.equals(s3)); // true

        // --------------------------------------------
        // intern()
        //
        // - Returns a canonical String reference
        // from the String Pool.
        // --------------------------------------------
        String pooled = s3.intern();
        System.out.println(s1 == pooled); // true
        System.out.println(s3 == pooled); // false

        // --------------------------------------------
        // equalsIgnoreCase()
        //
        // - Compares Strings ignoring case.
        // --------------------------------------------
        String name1 = "Alex";
        String name2 = "alex";
        System.out.println(name1.equals(name2)); // false
        System.out.println(name1.equalsIgnoreCase(name2)); // true

        // --------------------------------------------
        // Shared String Reference
        //
        // - Assignment copies the reference.
        // --------------------------------------------
        String original = "Hello";
        String copy = original;
        System.out.println(original == copy); // true
        System.out.println(original.equals(copy)); // true

        // --------------------------------------------
        // Null-Safe String Comparison
        //
        // - Calling equals() on null throws
        // NullPointerException.
        // - Use a constant String or Objects.equals()
        // to compare safely.
        // --------------------------------------------
        String name = null;

        // Unsafe: throws NullPointerException
        // System.out.println(name.equals("Hau"));

        // Safe: call equals() on a non-null constant
        System.out.println("Hau".equals(name)); // false

        // Safe: Objects.equals() handles null values
        System.out.println(Objects.equals(name, "Hau")); // false

        // Both values are null
        String first = null;
        String second = null;
        System.out.println(Objects.equals(first, second)); // true

        // Case-insensitive comparison with null safety
        String username = null;
        System.out.println("admin".equalsIgnoreCase(username)); // false
    }
}
