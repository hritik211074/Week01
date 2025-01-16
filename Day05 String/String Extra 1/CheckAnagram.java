import java.util.*;
public class CheckAnagram{

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter String1 : ");
        String st1 = scanner.nextLine(); // Taking user input as string
		
		 System.out.print("Enter String2 : ");
        String st2 = scanner.nextLine(); // Taking user input as string
		
		boolean isAnagram=checkAnagram(st1,st2);
		
		// Displaying the modified string
		if(isAnagram){
			System.out.println("Both string is anagram");
		}else{
		    System.out.println("Both string is not a anagram");
		}
	}
	public static boolean checkAnagram(String st1,String st2){
	        char arr1[]=st1.toCharArray();
		char arr2[]=st2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		return new String(arr1).equals(new String(arr2));
	}
}