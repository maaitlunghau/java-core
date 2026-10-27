
package methods;

public class VariableLengthArguments {

    public static void main(String[] args) {
        System.out.println(sum(10));
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum());

        int[] numbers = { 1, 2, 3, 4, 5 };
        System.out.println(sum(numbers));

        printNumbers("My numbers:", 10, 20, 30);

        // String... args is also valid for the main method.
        // This is equivalent in parameter behavior to String[] args.
    }

    private static int sum(int... numbers) {
        int result = 0;

        for (int number : numbers) {
            result += number;
        }

        return result;
    }

    private static void printNumbers(String label, int... numbers) {
        System.out.println(label);

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
