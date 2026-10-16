package operators;

public class Operators {

    public static void main(String[] args) {

        // --------------------------------------------
        // Unary Operators (Prefix & Postfix)
        // --------------------------------------------
        int a = 10;
        int b = ++a; // Increment first, then assign
        int c = a++; // Assign first, then increment

        System.out.println("a: " + a); // 12
        System.out.println("b: " + b); // 11
        System.out.println("c: " + c); // 11

        // --------------------------------------------
        // Arithmetic Operators
        // --------------------------------------------
        int x = 10;
        int y = 3;

        System.out.println("Addition: " + (x + y)); // 13
        System.out.println("Subtraction: " + (x - y)); // 7
        System.out.println("Multiplication: " + (x * y)); // 30
        System.out.println("Division: " + (x / y)); // 3
        System.out.println("Modulus: " + (x % y)); // 1

        // --------------------------------------------
        // Assignment Operators
        // --------------------------------------------
        int number = 10;

        number += 5;
        System.out.println("number: " + number); // 15

        number *= 2;
        System.out.println("number: " + number); // 30

        // --------------------------------------------
        // Relational Operators
        // --------------------------------------------
        System.out.println("Equal: " + (x == y)); // false
        System.out.println("Not equal: " + (x != y)); // true
        System.out.println("Greater: " + (x > y)); // true
        System.out.println("Less: " + (x < y)); // false

        // --------------------------------------------
        // 5. Logical Operators (Short-circuit)
        // --------------------------------------------
        boolean isActive = true;
        boolean isVerified = false;

        System.out.println(isActive && isVerified); // false
        System.out.println(isActive || isVerified); // true
        System.out.println(!isActive); // false
        System.out.println(isActive ^ isVerified); // true

        // Short-circuit prevents division by zero
        int zero = 0;
        boolean safe = false && (10 / zero > 0);

        System.out.println("safe: " + safe); // false

        // --------------------------------------------
        // Bitwise Operators
        // --------------------------------------------
        int first = 4; // Binary: 0100
        int second = 5; // Binary: 0101

        System.out.println("AND: " + (first & second)); // 4
        System.out.println("OR: " + (first | second)); // 5
        System.out.println("XOR: " + (first ^ second)); // 1
        System.out.println("NOT: " + (~1)); // -2

        // Bit Shift Operators
        System.out.println("Left Shift: " + (5 << 1)); // 10
        System.out.println("Right Shift: " + (5 >> 1)); // 2
        System.out.println("Signed: " + (-128 >> 1)); // -64
        System.out.println("Unsigned: " + (-128 >>> 1)); // 2147483584

        // --------------------------------------------
        // Ternary Operator
        // --------------------------------------------
        int age = 20;
        String status = age >= 18 ? "Adult" : "Minor";

        System.out.println("status: " + status); // Adult

        // --------------------------------------------
        // Operator Precedence
        // --------------------------------------------
        int result1 = 10 + 5 * 2;
        int result2 = (10 + 5) * 2;

        System.out.println("result1: " + result1); // 20
        System.out.println("result2: " + result2); // 30
    }
}