package big_decimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalExercise {

    public static void main(String[] args) {

        // --------------------------------------------
        // Integer Division
        //
        // - Integer division removes the decimal part.
        // - It does not round the result.
        // --------------------------------------------
        int total = 20;
        int people = 3;
        System.out.println("Integer division: " + (total / people)); // 6

        double result = (double) total / people;
        System.out.println("Double division: " + result); // 6.666666666666667

        // --------------------------------------------
        // Floating-Point Precision
        //
        // - double and float may produce rounding errors.
        // --------------------------------------------
        double a = 3.1;
        double b = 1.21;
        System.out.println("Double subtraction: " + (a - b)); // 1.8900000000000001

        // --------------------------------------------
        // BigDecimal
        //
        // - Used for precise decimal arithmetic.
        // - Prefer String constructor or valueOf().
        // --------------------------------------------
        BigDecimal num1 = new BigDecimal("3.1");
        BigDecimal num2 = new BigDecimal("1.21");

        BigDecimal difference = num1.subtract(num2);

        System.out.println("BigDecimal subtraction: " + difference); // 1.89

        // --------------------------------------------
        // Scale
        //
        // - Scale controls decimal places.
        // --------------------------------------------
        BigDecimal price = BigDecimal.valueOf(20);

        price = price.setScale(2);

        System.out.println("Price: " + price); // 20.00

        // --------------------------------------------
        // RoundingMode
        //
        // - Controls how decimal results are rounded.
        // --------------------------------------------
        BigDecimal amount = BigDecimal.valueOf(20);
        BigDecimal count = BigDecimal.valueOf(3);

        BigDecimal payment = amount.divide(
                count,
                2,
                RoundingMode.HALF_UP);

        System.out.println("Payment per person: " + payment); // 6.67

        // --------------------------------------------
        // ArithmeticException
        //
        // - Non-terminating decimal division requires
        // a scale and rounding mode.
        // --------------------------------------------

        // BigDecimal invalid = amount.divide(count);
        // System.out.println(invalid); // ❌ Runtime Exception: ArithmeticException
    }
}