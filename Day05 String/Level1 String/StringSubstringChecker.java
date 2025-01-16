import java.util.*;
public class StringSubstringChecker{

       // Method to check whether string are equal or not
	   public static String findSubstring(String s,int start,int last){
	
	       int length=s.length();  // Finding string s length
		  
		   String sub="";
		   for(int i=start;i<=last;i++){
		       sub+=s.charAt(i);
		   }
		   
		   return sub; //returning the substring
	   
	   }
       public static void main(String args[]){
	   
           // Creating scanner object to read user input
		   Scanner sc=new Scanner(System.in);
		   
		   System.out.println("Enter the string: ");
		   // Taking user input as string
		   String s=sc.next();
		   
		   System.out.println("Enter the starting index: ");
		   int start=sc.nextInt();  // Starting index
		   
		   System.out.println("Enter the last index: ");
		   int last=sc.nextInt();   // Last index
		   
		   int lengthOfString=s.length();
		   
		   if(start<0 || start>=lengthOfString || last<0 || last>=lengthOfString){
		   
		          System.out.println("Enter a valid string !!");
				  System.exit(0);
		   }
		
		   
		   // Calling method to find substring of string s
		   String sub1= findSubstring(s,start,last);
		   
		   // From built in method substring
		   
		   String sub2=s.substring(start,last+1);
		    //System.out.println(sub2);
		   if(sub1.equals(sub2)){
		         System.out.println("Both sub string are equals !!");
		   }else{
		         System.out.println("Both sub string are not equals !!");
		   
		   }
		   
		  
		   
	}
}