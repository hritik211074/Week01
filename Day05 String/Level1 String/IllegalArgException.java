import java.util.Scanner;

public class IllegalArgException {

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

    // Method that generate IllegalArgumentException
    public static void generateException(String text) {
        try {
            // Use substring with an invalid range
            System.out.println("Substring: " + text.substring(5, 3));
        } catch (IllegalArgumentException e) {
            // This will print a message and rethrow the exception
            System.out.println("This exception will terminate the program without handling.");
            throw e; // Rethrowing the exception
        }
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String text) {
        try {
            // Finding the substring with an invalid range
            System.out.println("Substring: " + text.substring(5, 3));
			
        } catch (IllegalArgumentException e) {
			
            // Handle the IllegalArgumentException
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
			
            System.out.println("Start index cannot be greater than the end index.");
			
        } catch (RuntimeException e) {
            // Handle other runtime exceptions (if any)
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }
}
