
package control_flow;

public class SwitchStatements {

    public static void main(String[] args) {
        // --------------------------------------------
        // Basic Switch Statement
        //
        // - Selects a branch based on a value.
        // - break exits the switch statement.
        // --------------------------------------------
        String customerStatus = "PREMIUM";

        switch (customerStatus) {
            case "GUEST":
                System.out.println("Guest customer");
                break;

            case "REGULAR":
                System.out.println("Regular customer");
                break;

            case "PREMIUM":
                System.out.println("Premium customer");
                break;

            default:
                System.out.println("Unknown customer");
        }

        // --------------------------------------------
        // Fall-through Behavior
        //
        // - Without break, execution continues
        // into the following cases.
        // --------------------------------------------
        int number = 1;

        switch (number) {
            case 1:
                System.out.println("One");

            case 2:
                System.out.println("Two");

            case 3:
                System.out.println("Three");
                break;

            default:
                System.out.println("Unknown");
        }

        // --------------------------------------------
        // Default Case
        //
        // - Executes when no case matches.
        // --------------------------------------------
        int value = 10;

        switch (value) {
            case 1:
                System.out.println("Value is one");
                break;
            case 2:
                System.out.println("Value is two");
                break;
            default:
                System.out.println("Unknown value");
        }

        // --------------------------------------------
        // Customer Discount Calculation
        //
        // - Applies a discount based on status.
        // - Example business rules for practice.
        // --------------------------------------------
        double orderPrice = 1000;
        double discountRate;

        switch (customerStatus) {
            case "GUEST":
                discountRate = 0.0;
                break;

            case "REGULAR":
                discountRate = 0.05;
                break;

            case "PREMIUM":
                discountRate = 0.15;
                break;

            default:
                discountRate = 0.0;
        }

        double finalPrice = orderPrice * (1 - discountRate);

        System.out.printf("Discount: %.0f%%%n",
                discountRate * 100);

        System.out.printf("Final price: %.2f%n",
                finalPrice);

        // --------------------------------------------
        // Enhanced Switch Statement (Java 14+)
        //
        // - Uses arrow syntax (->).
        // - No accidental fall-through.
        // - Multiple labels can share one branch.
        // --------------------------------------------
        String role = "ADMIN";

        switch (role) {
            case "ADMIN", "SUPER_ADMIN" ->
                System.out.println("Full access");
            case "USER" ->
                System.out.println("Limited access");
            default ->
                System.out.println("Unknown role");
        }

        // --------------------------------------------
        // Switch Expression (Java 14+)
        //
        // - Returns a value.
        // - No break required with arrow syntax.
        // --------------------------------------------
        int discountPercent = switch (customerStatus) {
            case "GUEST" -> 0;
            case "REGULAR" -> 5;
            case "PREMIUM" -> 15;
            default -> 0;
        };

        System.out.println(discountPercent); // 15
    }
}
