import java.util.*;
public class StringCharArray{

       // Method to check whether string are equal or not
	   public static char[] findCharArr(String s){
	
	       int length=s.length();  // Finding string s lengthOfString
		   char arr[]=new char[length];
		   
		   for(int i=0;i<length;i++){
		       arr[i]=s.charAt(i);
		   }
		   
		   return arr;
	   
	   }
       public static void main(String args[]){
	   
           // Creating scanner object to read user input
		   Scanner sc=new Scanner(System.in);
		   
		   System.out.println("Enter the string: ");
		   // Taking user input as string
		   String s=sc.next();
		   
		   
		   
		   // Calling method to find character arrayy of string s
		   char charArr1[]= findCharArr(s);
		   
		   // From built in method toCharArray() 
		   
		   char charArr2[]=s.toCharArray();
		   
		   
		   
		   if(Arrays.equals(charArr1,charArr2)){
			     // Printing the charcter array
			     System.out.println(Arrays.toString(charArr1));
		         System.out.println("Both character array are equal !!");
		   }else{
		         System.out.println("Both character array are not equals !!");
		   
		   }
		   
		  
		   
	}
}