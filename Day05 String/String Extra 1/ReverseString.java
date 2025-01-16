import java.util.*;
public class ReverseString{

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter String : ");
        String st = scanner.nextLine();
		
		String reverse=reverseString(st);
		
		System.out.println("Reverse string is : "+ reverse);
		
	}
	static String reverseString(String st){
	    StringBuilder sb=new StringBuilder(st);
		int i=0;
        int j=sb.length()-1;
		while(i<j){
		   char temp = sb.charAt(i);
           sb.setCharAt(i, sb.charAt(j));
           sb.setCharAt(j, temp);
		   i++;
		   j--;
		}
		return sb.toString();
	}
}