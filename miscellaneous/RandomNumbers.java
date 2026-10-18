
package miscellaneous;

import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {
        // --------------------------------------------
        // Create a Random Object
        //
        // - Random generates pseudorandom values.
        // --------------------------------------------
        Random random = new Random();

        // --------------------------------------------
        // Generate Random Values
        //
        // - nextInt() generates an int.
        // - nextLong() generates a long.
        // - nextFloat() generates a float.
        // - nextDouble() generates a double.
        // - nextBoolean() generates a boolean.
        // --------------------------------------------
        int randomInt = random.nextInt();
        long randomLong = random.nextLong();
        float randomFloat = random.nextFloat();
        double randomDouble = random.nextDouble();
        boolean randomBoolean = random.nextBoolean();

        System.out.println("Random int: " + randomInt);
        System.out.println("Random long: " + randomLong);
        System.out.println("Random float: " + randomFloat);
        System.out.println("Random double: " + randomDouble);
        System.out.println("Random boolean: " + randomBoolean);

        // --------------------------------------------
        // Generate a Number from 0 to 99
        //
        // - The upper bound is exclusive.
        // --------------------------------------------
        int number = random.nextInt(100);
        System.out.println("Random number (0-99): " + number);

        // --------------------------------------------
        // Generate a Number from 1 to 100
        //
        // - Add 1 to shift the range.
        // --------------------------------------------
        int numberFromOne = random.nextInt(100) + 1;
        System.out.println("Random number (1-100): " + numberFromOne);

        // --------------------------------------------
        // Generate a Number in a Custom Range
        //
        // - Both min and max are inclusive.
        // --------------------------------------------
        int min = 10;
        int max = 20;

        int randomInRange = random.nextInt(max - min + 1) + min;
        System.out.println("Random number (10-20): " + randomInRange);

        // --------------------------------------------
        // Dice Roll Example
        //
        // - Simulates rolling a six-sided die.
        // --------------------------------------------
        int dice = random.nextInt(6) + 1;
        System.out.println("Dice result: " + dice);

        // --------------------------------------------
        // Math.random()
        //
        // - Returns a double from 0.0 (inclusive)
        // to 1.0 (exclusive).
        // --------------------------------------------
        double mathRandom = Math.random();
        System.out.println("Math.random(): " + mathRandom);

        // --------------------------------------------
        // Random with a Fixed Seed
        //
        // - The same seed produces the same sequence.
        // - Useful for testing and debugging.
        // --------------------------------------------
        Random seededRandom = new Random(12345);

        System.out.println("Seeded value 1: " + seededRandom.nextInt(100));
        System.out.println("Seeded value 2: " + seededRandom.nextInt(100));
        System.out.println("Seeded value 3: " + seededRandom.nextInt(100));
    }
}
