public class GenerateException {
    public static void main(String[] args) {
        try {
            generateNullPointerException();
        } catch (NullPointerException e1) {
            System.out.println("Exception caught: " + e1.getMessage());
        } 
    }

        // Method to generate NullPointerException
    public static void generateNullPointerException() {
        String text = null;   // Initialize variable to null
		
        // Attempt to call a String method on the null reference
        System.out.println("Length of text: " + text.length());
    }
}
