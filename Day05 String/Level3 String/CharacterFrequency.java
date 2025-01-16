import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
	
	    // Creating the scanner object to read user input
        Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Calling method to find the frequency of character
        int[][] charFrequencyArray = findCharFrequency(text);

        // Display the characters and their frequencies
        System.out.println("Character Frequencies:");
        for (int i = 0; i < charFrequencyArray.length; i++) {
		
            if (charFrequencyArray[i][1] > 0) {
                System.out.println((char) charFrequencyArray[i][0] + ": " + charFrequencyArray[i][1]);
            }
        }
    }

    // Method to find the frequency of characters in a string using charAt() method
    public static int[][] findCharFrequency(String text) {
        int[] charFrequency = new int[256]; // Array to store frequency of characters

        // Loop to find the frequency of characters
        for (int i = 0; i < text.length(); i++) {
            charFrequency[text.charAt(i)]++;
        }

        // Create a 2D array to store characters and their frequencies
        int[][] result = new int[256][2];
		
        for (int i = 0; i < 256; i++) {
		
            result[i][0] = i; // ASCII value of the character
            result[i][1] = charFrequency[i]; // Frequency of the character
        }

        return result;
    }
}
