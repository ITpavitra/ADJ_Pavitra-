package A1;

public class reverseString {

	    public static String reverseString(String str) {
	        StringBuilder sb = new StringBuilder(str);
	        return sb.reverse().toString();
	    }

	    public static void main(String[] args) {
	        String input = "AIET College";
	        System.out.println("Original: " + input);
	        System.out.println("Reversed: " + reverseString(input));
	    }
	}
