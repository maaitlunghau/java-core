
package control_flow;

public class IfElseStatements {
    public static void main(String[] args) {
        // --------------------------------------------
        // If Statement
        //
        // - Executes a block when the condition
        // evaluates to true.
        // --------------------------------------------
        int coins = 50;
        int itemPrice = 100;

        if (coins < itemPrice) {
            System.out.println("Not enough coins!");
        }

        // --------------------------------------------
        // If-Else Statement
        //
        // - Executes one of two possible branches.
        // --------------------------------------------
        coins = 150;

        if (coins < itemPrice) {
            System.out.println("Not enough coins!");
        } else {
            System.out.println("Purchase successful!");
        }

        // --------------------------------------------
        // Curly Braces
        //
        // - Braces are optional for one statement.
        // - Always use braces for readability.
        // --------------------------------------------
        if (coins >= itemPrice) {
            System.out.println("You can buy this item.");
        }

        // --------------------------------------------
        // Nested If Statement
        //
        // - An if statement inside another if.
        // - else belongs to the matching inner if.
        // --------------------------------------------
        boolean isAccountActive = true;

        if (coins >= itemPrice) {
            if (isAccountActive) {
                System.out.println("Purchase allowed!");
            } else {
                System.out.println("Account is inactive!");
            }
        } else {
            System.out.println("Not enough coins!");
        }

        // --------------------------------------------
        // Else-If Ladder
        //
        // - Checks conditions from top to bottom.
        // - Executes the first matching branch.
        // --------------------------------------------
        double orderPrice = 350;
        double discountRate = 0;

        if (orderPrice > 0 && orderPrice < 100) {
            discountRate = 0.05;
        } else if (orderPrice >= 100 && orderPrice < 500) {
            discountRate = 0.10;
        } else if (orderPrice >= 500 && orderPrice < 5000) {
            discountRate = 0.15;
        }

        System.out.println("Discount rate: "
                + (discountRate * 100) + "%");
        // Discount rate: 10.0%

        // --------------------------------------------
        // 6. Calculate Final Order Price
        //
        // - Applies the selected discount rate.
        // - Practical extension of the course example.
        // --------------------------------------------
        double discountAmount = orderPrice * discountRate;
        double finalPrice = orderPrice - discountAmount;

        System.out.printf("Original price: %.2f%n", orderPrice);
        System.out.printf("Discount amount: %.2f%n", discountAmount);
        System.out.printf("Final price: %.2f%n", finalPrice);

        // Original price: 350.00
        // Discount amount: 35.00
        // Final price: 315.00
    }
}
