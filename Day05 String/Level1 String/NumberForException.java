import java.util.Scanner;

public class NumberForException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        // Method that generates the exception
        System.out.println("Calling method to generate exception:");
        generateException(input);

        //Method that handles the exception
        System.out.println("Calling method to handle exception:");
        handleException(input);

        scanner.close();
    }

    // Method to generate NumberFormatException
    public static void generateException(String text) {
        try {
            // Attempt to parse the input string to an integer
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
			
        } catch (NumberFormatException e) {
            // Exception not handled here; rethrows it
            System.out.println("This exception will terminate the program without handling.");
            throw e; // Rethrow the exception
        }
    }

    // Method to handle NumberFormatException
    public static void handleException(String text) {
        try {
            // Attempt to parsing the input string to an integer
            int number = Integer.parseInt(text);
			
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            // Handling the NumberFormatException
            System.out.println("NumberFormatException caught: " + e.getMessage());
			
            System.out.println("The input must be a valid integer value.");
        } catch (RuntimeException e) {
            // Handle other runtime exceptions
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }
}
