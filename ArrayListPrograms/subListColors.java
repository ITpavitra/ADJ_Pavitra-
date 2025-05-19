package A1;
import java.util.ArrayList;
import java.util.List;
public class subListColors {


	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>();

	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");

	        System.out.println("Original list: " + colors);

	        // Extracting 1st and 2nd elements (index 0 to 2, exclusive of 2)
	        List<String> subColors = colors.subList(0, 2);

	        System.out.println("Extracted sublist: " + subColors);
	    }
	}
