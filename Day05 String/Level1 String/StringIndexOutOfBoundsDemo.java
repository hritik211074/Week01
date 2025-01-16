import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input a the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Method that generates the exception
        System.out.println("Calling method to generate exception:");
        generateException(input);

        // Method to handles the exception
        System.out.println("Calling method to handle exception:");
        handleException(input);

        scanner.close();
    }

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {
        try {
			int length=text.length();
            // Accessing an index beyond the length of the string
            System.out.println("Character is : " + text.charAt(length));
        } catch (StringIndexOutOfBoundsException e) {
			
            System.out.println("This exception will terminate the program without handling.");
            throw e; // Throwing the exception again
        }
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String text) {
        try {
			int length=text.length();
            // Accessing an index beyond the length of the string
            System.out.println("Character is: " + text.charAt(length));
        } catch (StringIndexOutOfBoundsException e) {
            // Handle the exception and gives the result
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println("The index you are trying to access is out of bounds.");
        }
    }
}
