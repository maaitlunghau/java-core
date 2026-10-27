
package enums;

public class EnumExamples {

    public static void main(String[] args) {
        // Declare and use an enum
        Priority priority = Priority.HIGH;
        System.out.println("Priority: " + priority);

        // Use enum in switch
        switch (priority) {
            case HIGH:
                System.out.println("Handle immediately");
                break;
            case MEDIUM:
                System.out.println("Handle normally");
                break;
            case LOW:
                System.out.println("Handle when possible");
                break;
        }

        // Convert String to enum
        Priority parsed = Priority.valueOf("MEDIUM");
        System.out.println("Parsed: " + parsed);

        // Compare enum constants
        System.out.println(Priority.HIGH == Priority.HIGH); // true
        System.out.println(Priority.HIGH == Priority.LOW); // false

        // Get ordinal
        System.out.println("HIGH ordinal: "
                + Priority.HIGH.ordinal());

        // Iterate over all enum constants
        for (Priority item : Priority.values()) {
            System.out.println(item);
        }

        // Enum with properties and methods
        System.out.println("January days: "
                + Month.JANUARY.getDaysAmount());
    }
}
