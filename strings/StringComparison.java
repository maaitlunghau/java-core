package strings;

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
    }
}
