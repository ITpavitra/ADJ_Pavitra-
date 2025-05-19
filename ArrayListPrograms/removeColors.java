package A1;
import java.util.ArrayList;
public class removeColors {
	

	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>();

	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Purple");

	        System.out.println("Original list: " + colors);

	        // Remove 2nd element (index 1)
	        if (colors.size() > 1) {
	            colors.remove(1);
	        }

	        // Remove color "Blue"
	        colors.remove("Blue");

	        System.out.println("After removal: " + colors);
	    }
	}
