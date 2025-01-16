import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
		// Creating the scanner object to read user input
        Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();   //Taking usser input as a string

        // Calling method to find first non repeating character
        char firstNonRepeatingChar = findFirstNonRepeatingChar(text);
		
        if (firstNonRepeatingChar != '\0') {
            System.out.println("First non-repeating character: " + firstNonRepeatingChar);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    // Method to find the first non-repeating character in a string using charAt() method
    public static char findFirstNonRepeatingChar(String text) {
        int[] charFrequency = new int[256]; // Array to store frequency of characters

        // Loop to find the frequency of characters
        for (int i = 0; i < text.length(); i++) {
            charFrequency[text.charAt(i)]++;
        }

        // Loop to find the first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            if (charFrequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }

        return '\0'; // Return null character if no non-repeating character is found
    }
}
