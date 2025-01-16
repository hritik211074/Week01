import java.util.Scanner;

public class UniqueCharacterFrequency {
    public static void main(String[] args) {
	    
		// Creating the scanner object to read user input
        Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
		// Calling method to store the frquency of unique character
        char[] uniqueChars = findUniqueCharacters(text);
		
        String[][] charFrequencyArray = findCharFrequency(text, uniqueChars);

        // Display the characters and their frequencies
        System.out.println("Character Frequencies:");
        for (String[] charFreq : charFrequencyArray) {
            System.out.println(charFreq[0] + ": " + charFreq[1]);
        }
    }

    // Method to find unique characters in a string using charAt() method
    public static char[] findUniqueCharacters(String text) {
        char[] uniqueChars = new char[text.length()];
        int uniqueCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Resize array to the number of unique characters
        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);

        return result;
    }

    // Method to find the frequency of characters in a string using the unique characters
    public static String[][] findCharFrequency(String text, char[] uniqueChars) {
        int[] charFrequency = new int[256];   // To store the frequency of unique character

        // Loop to find the frequency of characters
        for (int i = 0; i < text.length(); i++) {
            charFrequency[text.charAt(i)]++;
        }

        // Create a 2D String array to store unique characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];
		
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]); // Character
            result[i][1] = String.valueOf(charFrequency[uniqueChars[i]]); // Frequency
        }

        return result;
    }
}
