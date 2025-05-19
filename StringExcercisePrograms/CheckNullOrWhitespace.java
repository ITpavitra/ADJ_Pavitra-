package A1;

public class CheckNullOrWhitespace {

	    public static boolean isNullOrEmpty(String str) {
	        return str == null || str.trim().isEmpty();
	    }

	    public static void main(String[] args) {
	        String input = "   "; // Try with null, "", or any non-empty string

	        if (isNullOrEmpty(input)) {
	            System.out.println("The string is null or empty.");
	        } else {
	            System.out.println("The string is not empty.");
	        }
	    }
	}
