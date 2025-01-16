import java.util.*;
public class WordReplace {
    public static String replaceWord(String sentence, String target, String replacement) {
      
        return sentence.replace(target, replacement);   // Method to replace the string part in another 
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter String : ");
        String sentence = scanner.nextLine(); // Taking user input as string
		
		System.out.print("Enter target string : ");
        String target = scanner.nextLine(); // Taking user input as string
		 
        System.out.print("Enter replace string : ");
        String replace = scanner.nextLine(); // Taking user input as string
	

        String result = replaceWord(sentence, target, replace);
        System.out.println("Original Sentence: " + sentence);   // This is original string
        System.out.println("Modified Sentence: " + result);   // This is modified string
    }
}
