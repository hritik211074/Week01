import java.util.Scanner;
public class CountVowels{

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter String : ");
        String st = scanner.nextLine();
		int vowelCount = countVowel(st);
		int consonantCount = st.length()-vowelCount;
		
		System.out.println("No of vowels present in the strings "+ vowelCount + " and no of consonant present in the string is "+ consonantCount);
		
	}
	static int countVowel(String st){
		int count = 0;
		for(int i=0; i<st.length(); i++){
	     if(st.charAt(i) == 'a' || st.charAt(i) == 'e' || st.charAt(i) == 'i' || st.charAt(i) == 'o' 
		 || st.charAt(i) == 'u' || st.charAt(i) == 'A' || st.charAt(i) == 'E' || st.charAt(i) == 'I' || st.charAt(i) == 'O' || st.charAt(i) == 'U'){
				count++;
		
		  }
		}
		return count;
	}
}