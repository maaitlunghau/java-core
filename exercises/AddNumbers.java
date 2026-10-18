package exercises;

/**
 * ---------------------------------------------
 * Simple Number Calculator
 * ---------------------------------------------
 * 
 * Implement console program which will meet the following requirements:
 * 
 * a. Program is started with two arguments (numbers)
 * b. Program adds these two numbers
 * c. In case one of the input arguments is floating-point number - the result
 * of addition is floating-point number
 * d. In case two arguments are integer - the result of addition is integer
 */
public class AddNumbers {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide exactly for two numbers!");
            return;
        }

        double result = 0;
        boolean hasFloatingPoint = false;

        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);
                result += num;
            } catch (NumberFormatException e) {
                try {
                    double num = Double.parseDouble(arg);

                    if (!Double.isFinite(num)) {
                        System.out.println("Invalid number!");
                        return;
                    }

                    result += num;
                    hasFloatingPoint = true;

                } catch (NumberFormatException ex) {
                    System.out.println("Invalid number!");
                    return;
                }
            }
        }

        if (hasFloatingPoint) {
            System.out.println("Result of addition is: " + result);
        } else {
            System.out.println("Result of addition is: " + (int) result);
        }
    }
}
