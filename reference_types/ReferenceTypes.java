package reference_types;

import java.util.Arrays;

public class ReferenceTypes {

    public static void main(String[] args) {

        // --------------------------------------------
        // Primitive Type Comparison
        //
        // - == compares primitive values.
        // --------------------------------------------
        int a = 10;
        int b = 10;
        System.out.println(a == b); // true

        // --------------------------------------------
        // Reference Type Comparison
        //
        // - == compares object references.
        // --------------------------------------------
        Integer num1 = Integer.valueOf(200);
        Integer num2 = Integer.valueOf(200);
        System.out.println(num1 == num2); // Usually false (outside default cache)

        // --------------------------------------------
        // 3. Integer Cache
        //
        // - Integer values from -128 to 127 are cached.
        // --------------------------------------------
        Integer cached1 = 127;
        Integer cached2 = 127;
        System.out.println(cached1 == cached2); // true

        // --------------------------------------------
        // equals() Method
        //
        // - Integer.equals() compares numeric values.
        // --------------------------------------------
        Integer x = 200;
        Integer y = 200;
        System.out.println(x.equals(y)); // true

        // --------------------------------------------
        // Array Comparison
        //
        // - Arrays do not override Object.equals().
        // - Arrays.equals() compares array contents.
        // --------------------------------------------
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 1, 2, 3 };
        System.out.println(arr1 == arr2); // false
        System.out.println(arr1.equals(arr2)); // false
        System.out.println(Arrays.equals(arr1, arr2)); // true

        // --------------------------------------------
        // Shared Object Reference
        //
        // - Assignment copies the reference.
        // - Both variables point to the same object.
        // --------------------------------------------
        int[] original = { 1, 2, 3 };
        int[] copy = original;
        System.out.println(original == copy); // true

        copy[0] = 99;
        System.out.println(Arrays.toString(original)); // [99, 2, 3]
    }
}