import java.util.*;
public class ToggleCharacter{

    public static void main(String[] args) {
	
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter String : ");
        String s = scanner.nextLine(); // Taking user input as string
		
		
		String toggle=makeToogleString(s);   //calling method to make user input string toogle
		// Displaying the result
		System.out.print("Toogle string is: "+toggle);
		
	}
	public static String makeToogleString(String s){
		StringBuilder sb=new StringBuilder(s);
		for(int i=0;i<sb.length();i++){
			int ascii=sb.charAt(i);  // Finding ascii value of character
			if(ascii >=65 && ascii <=91){  
			    char ch=(char)(ascii+32);
				sb.setCharAt(i,ch);
			}else{
				char ch=(char)(ascii-32);
				sb.setCharAt(i,ch);
			}
			
		}
		return sb.toString();
	}
}