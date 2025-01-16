import java.util.*;
public class LongestWordLength{

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter String : ");
        String st = scanner.nextLine(); // Taking user input as string
		
		String distinctString[]=st.split(" ");  // finding all the string 
		
		String longestString=findLongestString(distinctString);
		// Displaying the result
		System.out.print("Longest length of string is : "+longestString);
	}
	public static String findLongestString(String st[]){
		int len=Integer.MIN_VALUE;
		String result="";
		int size=st.length;  // Length of string array
		for(int i=0;i<size;i++){
		   int tempLength=st[i].length();
		   if(tempLength>len){
		      len=tempLength;
			  result=st[i];
		   }
		}
		return result;
	}
}