import java.util.Scanner;

public class ArrayIndexingOutOfBoundsException {

    public static void main(String[] args) {
		
		//Creating the scanner object to read user input
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		String input=sc.next();   // Taking user input
       
        // Method that generates the ArrayOutOfBoundsException exception
        System.out.println("Calling method to generate exception:");
        generateException(input);

        // Method that handles the exception
        System.out.println("Calling method to handle exception:");
        handleException(input);

        sc.close();
    }

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String input) {

        try {
			int len=input.length();
            // Attempting to access an invalid index (larger than the array length)
            System.out.println("Accessing element at index 10: " + input.charAt(len));
        } catch (ArrayIndexOutOfBoundsException e) {
			
            // Handling the exception 
            System.out.println("This exception will terminate the program without handling.");
            throw e; // Rethrow the exception to stop the program
        }
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String input) {
        try {
			int len=input.length();
            // Attemptng to access an invalid index (larger than the array length)
            System.out.println("Accessing element at index length of names array: " + input.charAt(len));
        } catch (ArrayIndexOutOfBoundsException e) {
			
            // Handle the ArrayIndexOutOfBoundsException
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
			
            System.out.println("The index we access is beyond the array bounds.");
			
        } catch (RuntimeException e) {
            // Handle other runtime exceptions
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }
}
