package exercises;

import java.util.Scanner;

/**
 * ---------------------------------------------
 * User Activity Selector
 * ---------------------------------------------
 * 
 * Implement console program which will meet the following requirements:
 * 
 * a. Program is started and user is asked to enter one of possible events:
 * - login (Please, enter your usernam)
 * - sign_up (Welcome!)
 * - terminate_program (Thank you! Good bye!)
 * - main_menu (Main Menu)
 * - about_app (This app is created by me with support of @IT-Bulls.com)
 * - <any other input> (Please, enter one of these values: login, sign_up,
 * terminate_program, main_menu, about_app)
 * 
 * b. Based on user input program prints to console different text.
 * (Mapping is above)
 */
public class UserActivitySelector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter your action name: ");
        String action = sc.nextLine().toLowerCase();

        switch (action) {
            case "login":
                System.out.println("Please, enter your username");
                break;
            case "sign_up":
                System.out.println("Welcome!");
                break;
            case "terminate_program":
                System.out.println("Thank you! Good bye!");
                break;
            case "main_menu":
                System.out.println("Main Menu");
                break;
            case "about_app":
                System.out.println("This app is created by me with support of @IT-Bulls.com");
                break;
            default:
                System.out.println(
                        "Please, enter one of these values: login, sign_up, terminate_program, main_menu, about_app");
        }

        sc.close();
    }
}
