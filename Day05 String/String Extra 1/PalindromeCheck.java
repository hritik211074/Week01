import java.util.*;
public class PalindromeCheck{

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter String : ");
        String st = scanner.nextLine(); // Taking user input as string
		
		boolean isPalindromic=checkPalindromic(st);  // checking palindromic
		
		if(isPalindromic){
			System.out.print("This is palindromic string : ");
		}else{
			System.out.print("This is not palindromic string : ");
		}
		

	}
	public static boolean checkPalindromic(String st){
		int i=0;
        int j=st.length()-1;
		while(i<j){
		   if(st.charAt(i)!=st.charAt(j)){  // checking indexwise charcter
		      return false;
		   }
		   i++;
		   j--;
		}
		return true;
	}
}