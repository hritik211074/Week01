import java.util.*;
public class MostFrequentCharacter{

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter String1 : ");
        String st = scanner.nextLine(); // Taking user input as string
		
		//Calling method to find most frequent character
		char mostFrequent=mostFrequency(st);
		
		// Displaying the most frequent character
		
		System.out.println("Most frequent charcter is: "+mostFrequent);
	}
	public static char mostFrequency(String st){
	    int freArr[]=new int[26];  // Creating 26 size frequency arrray to store frequency of charcter
		
		for(int i=0;i<st.length();i++){
			freArr[st.charAt(i)-97]++;
		}
		
		// Making variable to store most frequent character 
		char ch='!';
		int frequency=Integer.MIN_VALUE;
		
		for(int i=0;i<26;i++){
			if(freArr[i]>frequency){
				ch=(char)(i+97);
				frequency=freArr[i];
			}
		}
		return ch;
	}
}