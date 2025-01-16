import java.util.*;
public class StringChecker{
       // Method to check whether string are equal or not
	   public static boolean checkEqual(String s1,String s2){
	       int length1=s1.length();  // Finding s1 length
		   
		   int length2=s2.length();  // Finding s2 length
		   
		   if(length1!=length2)  return false;
		   
		   for(int i=0;i<length1;i++){
		       if(s1.charAt(i)!=s2.charAt(i)) return false;  // return false if character not equal
		   }
		   
		   return true;  // Finally at this stage every character get checked and all are equal
	   
	   }
       public static void main(String args[]){
		   
		   System.out.println("Enter the string : ");
	   
           // Ceating scanner object to read user input
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the first string: ");
		   // Taking user input as string1
		   String s1=sc.next();
		   
		    System.out.println("Enter the second string: ");
		    // Taking user input as string1
		   String s2=sc.next();
		   
		   // Calling method to check whether s1 and s2 are equal or not using charAt method
		   boolean isEqual1=checkEqual(s1,s2);
		   if(isEqual1){
		         System.out.println("Both string are equals !!");
		   }else{
		         System.out.println("Both string are not equals !!");
		   
		   }
		   
		   // 
		    boolean isEqual2=s1.equals(s2);
		   if(isEqual2){
			   
		         System.out.println("Both string are equals !!");
		   }else{
		         System.out.println("Both string are not equals !!");
		   
		   }
		   
		  
		   
	}
}