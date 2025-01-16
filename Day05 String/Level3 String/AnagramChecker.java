import java.util.Scanner;

public class AnagramChecker {

    public static void main(String[] args) {
		
		// Creating the scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String text1 = scanner.nextLine();   // Taking first string as input
        
        System.out.print("Enter the second string: ");
        String text2 = scanner.nextLine();  // Taking first string as input
        
		// calling method to check anagram or not
        boolean areAnagrams = checkAnagrams(text1, text2);
        
        if (areAnagrams) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }
        
        scanner.close();
    }

    public static boolean checkAnagrams(String text1, String text2) {
		
        // Check if lengths are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create frequency arrays for both texts
        int[] frequency1 = new int[256]; // Assuming ASCII characters
        int[] frequency2 = new int[256]; 

        // Count frequency of characters in both texts
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++;
            frequency2[text2.charAt(i)]++;
        }

        // Compare frequency arrays
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }

        return true;
    }
}