package exercises;

import java.util.Locale;

/**
 * -------------------------------------
 * Format floating-point number
 * -------------------------------------
 * 
 * Implement console program which meet the following requirements:
 * 
 * a. Program starts and prints Math.PI five times in console output
 * b. The first Math.PI contains only one fraction digit
 * c. The second Math.PI contains two fraction digits
 * d. The third time Math.PI contains three fraction digits
 * e. The fourth time Math.PI contains four fraction digits
 * f. The fifth time Math.PI contains five fraction digits
 */
public class PINumberFormatting {
    public static void main(String[] args) {
        double pi = 3.14159;

        System.out.printf(Locale.US, "%.1f%n", pi);
        System.out.printf(Locale.US, "%.2f%n", pi);
        System.out.printf(Locale.US, "%.3f%n", pi);
        System.out.printf(Locale.US, "%.4f%n", pi);
        System.out.printf(Locale.US, "%.5f%n", pi);
    }
}
