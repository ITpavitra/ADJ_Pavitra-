package A1;

public class subStringCounter {
	    public static int countOccurrences(String mainStr, String subStr) {
	        int count = 0;
	        int index = 0;

	        while ((index = mainStr.indexOf(subStr, index)) != -1) {
	            count++;
	            index += subStr.length();
	        }

	        return count;
	    }

	    public static void main(String[] args) {
	        String main = "AIET is in AIET college and AIET is best";
	        String sub = "AIET";

	        int occurrences = countOccurrences(main, sub);
	        System.out.println("Occurrences of '" + sub + "': " + occurrences);
	    }
	}
