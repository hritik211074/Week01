import java.util.*;
public class NullPointException {
    public static void main(String[] args) {
		
        //Call the method that generates the exception
        System.out.println("Calling method to generate exception:");
        generateException();

        // Call the method that handles the exception
        System.out.println("Calling method to handle exception: ");
        handleException();
    }

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null; // Initialize variable to null
		
        // This will generate a NullPointerException
        System.out.println("Length of text: " + text.length());
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null; // Initialize variable to null
        try {
            // Attempt to call a String method on the null reference
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            // Handle the exception and provide a message
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println("The variable 'text' is null and cannot invoke methods.");
        } catch(Exception e){
			
		}
    }
}
