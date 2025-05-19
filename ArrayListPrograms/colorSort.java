package A1;
import java.util.ArrayList;
import java.util.Collections;
public class colorSort {

	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>();

	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Purple");

	        System.out.println("Original list: " + colors);

	        // Sorting the list
	        Collections.sort(colors);

	        System.out.println("Sorted list: " + colors);
	    }
	}
