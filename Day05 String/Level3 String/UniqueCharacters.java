import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
		// Creating the scanner object to read user input
        Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        int textLength = getTextLength(text);   // Finding length of input without using any inbuilt method
		
		// Method call to fing unique character
        char[] uniqueCharacters = findUniqueCharacters(text, textLength);

        System.out.print("Unique characters: ");
        for (char ch : uniqueCharacters) {
                System.out.print(ch + " ");   // Printing unique character
        }
    }

    // Method to find the length of the text without using the length() method
    public static int getTextLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // End of string reached
        }
        return length;
    }

    // Method to find unique characters in a string using charAt() method
    public static char[] findUniqueCharacters(String text, int textLength) {
        char[] uniqueChars = new char[textLength];
        int uniqueCount = 0;

        for (int i = 0; i < textLength; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if currentChar is already in uniqueChars
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If unique, add to uniqueChars array
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Resize array to the number of unique characters
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueChars[i];
        }

        return result;
    }
}
