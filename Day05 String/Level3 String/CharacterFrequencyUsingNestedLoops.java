import java.util.Scanner;

public class CharacterFrequencyUsingNestedLoops {
    public static void main(String[] args) {
		
		// Creating the scanner object to read user input
        Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        String[] charFrequencyArray = findCharFrequency(text);

        // Display the characters and their frequencies
        System.out.println("Character Frequencies:");
        for (String charFreq : charFrequencyArray) {
            if (charFreq != null) {
                System.out.println(charFreq);
            }
        }
    }

    // Method to find the frequency of characters in a string
    public static String[] findCharFrequency(String text) {
		
        char[] characters = text.toCharArray();
        int[] frequencies = new int[characters.length];
        String[] result = new String[characters.length];

        for (int i = 0; i < characters.length; i++) {
            if (frequencies[i] == 0) { // If character frequency is not already counted
                frequencies[i] = 1;
                for (int j = i + 1; j < characters.length; j++) {
                    if (characters[i] == characters[j]) {
                        frequencies[i]++;
                        characters[j] = '0'; // Mark duplicate characters as '0'
                    }
                }
            }
        }

        // Store the characters and their frequencies in the result array
        int resultIndex = 0;
        for (int i = 0; i < frequencies.length; i++) {
            if (characters[i] != '0') {
                result[resultIndex] = characters[i] + ": " + frequencies[i];
                resultIndex++;
            }
        }

        return result;
    }
}
