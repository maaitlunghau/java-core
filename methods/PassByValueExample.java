package methods;

import java.util.Arrays;

public class PassByValueExample {

    private static void changePrimitive(int value) {
        value += 100;
    }

    private static int changePrimitiveWithReturn(int value) {
        return value + 100;
    }

    private static void changeArray(int[] array) {
        array[1] = 200;
    }

    private static void clearArray(int[] array) {
        array = null;
    }

    public static void main(String[] args) {

        // --------------------------------------------
        // Primitive Type
        // --------------------------------------------
        int number = 10;
        changePrimitive(number);
        System.out.println("Primitive: " + number); // 10

        // --------------------------------------------
        // Primitive with Return
        // --------------------------------------------
        number = changePrimitiveWithReturn(number);
        System.out.println("Primitive after return: " + number); // 110

        // --------------------------------------------
        // Array (Reference Type)
        // --------------------------------------------
        int[] numbers = { 1, 2, 3 };
        changeArray(numbers);
        System.out.println(Arrays.toString(numbers)); // [1, 200, 3]

        // --------------------------------------------
        // 4. Reassign Reference
        // --------------------------------------------
        clearArray(numbers);
        System.out.println(Arrays.toString(numbers)); // [1, 200, 3]
    }
}