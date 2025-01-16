import java.util.Scanner;

public class TextSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine(); // Read user input
        
        // Split using custom method
        String[] split = customSplit(input);
        
        // Split using built-in split() method
        String[] builtInSplit = input.split(" ");
        
        // Compare the two arrays
        boolean areEqual = compareStringArrays(split, builtInSplit);
        
        // Display results
        if(areEqual){
           System.out.println("Both result are equals? ");
		}else{
			System.out.println("Both result are not equals? ");
		}
    }
    
    public static int findStringLength(String str) {
        int count = 0;   // Initialize the count to store the size of string
        try {   // Exception handling
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception indicates the end of the string
        }
        return count;
    }
    
    public static String[] customSplit(String text) {
        int length = findStringLength(text);
        int wordCount = 0;
        
        // Count words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ' || i == length - 1) {
                wordCount++;
            }
        }
        
        // Store space indexes
        int[] spaceIndexes = new int[wordCount - 1];
        int indexCount = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[indexCount++] = i;
            }
        }
        
        //Finding the words
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount; i++) {
            int end = (i < spaceIndexes.length) ? spaceIndexes[i] : length;
            words[i] = text.substring(start, end).trim();
            start = end + 1;
        }
        
        return words;
    }
    // Call method to compare two string
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
}
