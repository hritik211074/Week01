import java.util.*;
public class CompareTwoString{

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter String1 : ");
        String st1 = scanner.nextLine(); // Taking user input as string
		
		System.out.print("Enter String2 : ");
        String st2 = scanner.nextLine(); // Taking user input as string
		
		//Calling method to find lexographically smallest string
		findLexographicallySmallest(st1,st2);
		
	}
	public static void findLexographicallySmallest(String st1,String st2){
	    boolean flag=false;   // initialize flag with flag
		int commonLength=Math.max(st1.length(),st2.length());  // Minimum of their length
		
		for(int i=0;i<commonLength;i++){
		   
		   if(st1.charAt(i)<st2.charAt(i)){
		      flag=true;   // St1 is lexicographical smallest
			  break;
		   }else if(st1.charAt(i)>st2.charAt(i)){
		      flag=false;   // St2 is lexicographical smallest
			  break;
		   }
		}
		if(flag){
		   System.out.println(st1+" comes before "+st2+" in lexicographical order");
		}else{
		   System.out.println(st2+" comes before "+st1+" in lexicographical order");
		}
	}
}