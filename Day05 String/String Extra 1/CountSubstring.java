import java.util.*;
public class CountSubstring{

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter String : ");
        String s = scanner.nextLine(); // Taking user input as string
		
		System.out.print("Enter a substring : ");
        String sb = scanner.nextLine(); // Taking user input as string
		
		int count=countSubstring(s,sb);
		// Displaying the result
		System.out.print("Count of substring in normal string is : "+count);
	}
	public static int countSubstring(String s,String sb){
		int count=0;  // Initialize count to zero to store number of substring
		
		int sbLength=sb.length();  // Length of substring
		
		int sLength=s.length();  //Length of normal string
		
		for(int i=0;i<=sLength-sbLength;i++){
			if(s.substring(i,i+sbLength).equals(sb)){  // Finding substring of length of sb string
				count++;
			}
		}
		return count;
	}
}