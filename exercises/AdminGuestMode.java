package exercises;

/**
 * ---------------------------------------------
 * Admin and Guest mode for application
 * ---------------------------------------------
 * 
 * Implement console program which will meet the following requirements:
 * 
 * a. Program can be started in ‘admin’ and ‘guest’ mode
 * b. To start program in ‘admin’ mode any of multiple string
 * arguments should be equal to ‘--admin’
 * c. To start program in ‘guest’ mode any of multiple string
 * arguments should be equal to ‘--guest’
 * d. Program cannot be started with ‘--admin’ and ‘--guest’
 * arguments simultaneously
 * e. If program is started in ‘admin’ mode then "Hello, Admin!" is printed to
 * console
 * f. If program is started in ‘guest’ mode then "Hello, Guest!" is printed to
 * console
 * g. If program is started with ‘--admin’ and ‘--guest’ arguments then program
 * prints "Please, select either 'ADMIN' or 'GUEST' mode for this program" to
 * console
 */
public class AdminGuestMode {
    public static void main(String[] args) {
        boolean isAdmin = false;
        boolean isGuest = false;

        for (String arg : args) {
            String mode = arg.substring(2).toLowerCase();

            if (mode.equals("admin")) {
                isAdmin = true;
            } else if (mode.equals("guest")) {
                isGuest = true;
            } else {
                System.out.println("Please, select either 'ADMIN' or 'GUEST' mode for this program");
                return;
            }
        }

        if (isAdmin && isGuest) {
            System.out.println("Please, select either 'ADMIN' or 'GUEST' mode for this program");
        } else if (isAdmin) {
            System.out.println("Hello, Admin!");
        } else {
            System.out.println("Hello, Guest!");
        }
    }
}