import java.util.*;
public class RemoveDuplicate{

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter String : ");
        String st = scanner.nextLine(); // Taking user input as string
		
		String distinctChar=findDistinct(st);  // finding distinct Character string
		
		// Displaying the result
		System.out.print("Distinct character string  is : "+distinctChar);
	}
	public static String findDistinct(String st){
		String result="";  // store a string which contain distinct character
		
		int length=st.length();  // Length of string
		for(int i=0;i<length;i++){
		    boolean flag=true;
			for(int j=0;j<result.length();j++){
			    if(st.charAt(i)==result.charAt(j)){
					flag=false;
					break;
				}
			}
			if(flag){
			  result+=st.charAt(i);
			}
		}
		return result;
	}
}