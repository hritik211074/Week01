import java.util.Scanner;

public class StringLengthFind {
    public static void main(String[] args) {
	
	    // Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.next();  // Take user input
        
        int calculatedLength = findStringLength(input);
        int actualLength = input.length();    // Built-in method
        
        System.out.println("Calculated Length: " + calculatedLength);
        System.out.println("Actual Length: " + actualLength);
    }

    public static int findStringLength(String str) {
        int count = 0;   // Initialize the count to store the size of string
        try {
            while (true) {
                str.charAt(count);   // Access character at index
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
			
            // Here we handle the exception
        }
        return count;
    }
}
