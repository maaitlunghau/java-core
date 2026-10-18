package exercises;

import java.math.BigDecimal;

public class AddNumbersBigDecimal {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide exactly two numbers!");
            return;
        }

        try {
            BigDecimal num1 = new BigDecimal(args[0]);
            BigDecimal num2 = new BigDecimal(args[1]);

            BigDecimal result = num1.add(num2);

            System.out.println("Result of addition is: " + result);
            System.out.println(
                    "Result of addition is (result.stripTrailingZeros()): "
                            + result.stripTrailingZeros());
            System.out.println(
                    "Result of addition is (result.stripTrailingZeros().toPlainString()): "
                            + result.stripTrailingZeros().toPlainString());

        } catch (NumberFormatException e) {
            System.out.println("Invalid number!");
        }
    }
}
