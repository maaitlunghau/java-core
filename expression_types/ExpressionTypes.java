package expression_types;

public class ExpressionTypes {

    public static void main(String[] args) {

        // --------------------------------------------
        // Expressions vs Statements
        // --------------------------------------------
        int a = 10;
        int b = 20;

        int result = a + b;
        // a + b: Expression
        // int result = a + b; : Statement
        System.out.println("Result: " + result); // 30

        // --------------------------------------------
        // Byte, Short, Char -> int
        //
        // - Arithmetic operations with these types
        // produce an int result.
        // --------------------------------------------
        byte byte1 = 10;
        byte byte2 = 20;

        int byteResult = byte1 + byte2; // ✅ Correct (int)
        // byte invalid = byte1 + byte2; // ❌ Compilation error

        short short1 = 100;
        short short2 = 200;
        int shortResult = short1 + short2; // int

        char char1 = 'A';
        char char2 = 'B';
        int charResult = char1 + char2; // 131 (int)

        System.out.println(byteResult); // 30 (int)
        System.out.println(shortResult); // 300 (int)
        System.out.println(charResult); // 131 (int)

        // --------------------------------------------
        // Mixed-Type Arithmetic
        //
        // - double > float > long > int
        // --------------------------------------------
        int intNumber = 10;
        long longNumber = 20L;
        float floatNumber = 2.5f;
        double doubleNumber = 3.5;

        long result1 = intNumber + longNumber;
        float result2 = longNumber + floatNumber;
        double result3 = floatNumber + doubleNumber;

        System.out.println(result1); // 30
        System.out.println(result2); // 22.5
        System.out.println(result3); // 6.0

        // --------------------------------------------
        // Integer vs Floating-Point Division
        // --------------------------------------------
        int total = 20;
        int people = 3;
        int integerResult = total / people;
        double doubleResult = (double) total / people;

        System.out.println(integerResult); // 6
        System.out.println(doubleResult); // 6.666666666666667

        // --------------------------------------------
        // String Concatenation
        //
        // - String + other type -> String
        // - Evaluation order matters.
        // --------------------------------------------
        int x = 10;
        int y = 20;
        System.out.println("Result: " + x + y); // Result: 1020
        System.out.println("Result: " + (x + y)); // Result: 30

        // --------------------------------------------
        // StringBuilder
        //
        // - Used to build strings with append().
        // --------------------------------------------
        StringBuilder sb = new StringBuilder();

        sb.append("Hello ");
        sb.append("Java Core!");

        String message = sb.toString();
        System.out.println("message: " + message);
    }
}