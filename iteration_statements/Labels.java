
package iteration_statements;

public class Labels {

    public static void main(String[] args) {

        // Break the Outer Loop
        outerLoop: for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 3) {
                    break outerLoop;
                }

                System.out.println(
                        "Break example: i = " + i + ", j = " + j);
            }
        }
        System.out.println("Outer loop terminated.");

        // Continue the Outer Loop
        outerLoop: for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 1) {
                    continue outerLoop;
                }

                System.out.println("Continue example: i = " + i + ", j = " + j);
            }
        }
    }
}
