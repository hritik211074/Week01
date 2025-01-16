import java.util.*;
public class RemoveCharacter{

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter String1 : ");
        String st = scanner.nextLine(); // Taking user input as string
		
		 System.out.print("Enter specific character : ");
        char ch = scanner.next().charAt(0); // Taking user input as specific character
		
		//Calling method to delete specific character
		String modifiedString=removeCharacter(st,ch);
		
		// Displaying the modified string
		
		System.out.println("Modified string  is: "+modifiedString);
	}
	public static String removeCharacter(String st,char ch){
	    
		// Creating String to store modified string
		String result="";
		for(int i=0;i<st.length();i++){
			if(st.charAt(i)!=ch){   // Checking character should not be equal to specific character
				result+=st.charAt(i);
			}
		}
		return result;
	}
}