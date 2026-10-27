
package methods;

public class MethodsIntroduction {

    // Sum Two Integers
    private static int sum(int a, int b) {
        return a + b;
    }

    // Sum Two Doubles (Method Overloading)
    private static double sum(double a, double b) {
        return a + b;
    }

    // Print a Message Without Returning a Value
    private static void printMessage(String message) {
        System.out.println(message);
    }

    // Print an Integer Without Returning a Value
    private static void printNumber(int number) {
        System.out.println("Number: " + number);
    }

    public static void main(String[] args) {

        int sumResult = sum(10, 20);
        System.out.println("Sum: " + sumResult);

        int intResult = sum(5, 15);
        System.out.println("Integer sum: " + intResult);

        double doubleResult = sum(5.5, 10.5);
        System.out.println("Double sum: " + doubleResult);

        printMessage("Hello, Java Methods!");

        printNumber(sum(100, 200));
    }
}
