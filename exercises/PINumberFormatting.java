package exercises;

import java.util.Locale;

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
