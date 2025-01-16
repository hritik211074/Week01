import java.util.Scanner;

public class ToUppercase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter the text:");
        String inputText = scanner.nextLine();

        // Convert to uppercase using charAt method
        String customUppercase = convertToUpperCase(inputText);
		
		
        // Convert to uppercase using built-in toUpperCase method
        String builtInUppercase = inputText.toUpperCase();

        // Display the results
        System.out.println("Custom uppercase conversion: " + customUppercase);
        System.out.println("Built-in uppercase conversion: " + builtInUppercase);

        // Compare both strings using the custom compare method
        boolean areEqual = compareStrings(customUppercase, builtInUppercase);

        // Display comparison result
        if (areEqual) {
            System.out.println("Both methods produce the same result.");
        } else {
            System.out.println("The results are different.");
        }

        scanner.close();
    }

    // Method to convert text to uppercase using charAt() and ASCII values
    public static String convertToUpperCase(String text) {
        String result="";
        // Loop through each character of the text
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            // check the character whether in lowercase and uppercase
            if (c >= 'a' && c <= 'z') {
                // Convert lowercase to uppercase using ascii value
                c = (char) (c - 32);   // 'a' (97) - 32 = 'A' (65)
            }
            result+=c;  // Append the character to the result
        }
        return result;
    }
	// Method to compare two strings 
    public static boolean compareStrings(String str1, String str2) {
        // Compare the strings using the equals method
        return str1.equals(str2);
    }

}
