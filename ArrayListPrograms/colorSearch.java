package A1;
import java.util.ArrayList;
public class colorSearch {
	

	    public static void main(String[] args) {
	        // Create an ArrayList to store colors
	        ArrayList<String> colors = new ArrayList<>();

	        // Add colors to the ArrayList
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Red");
	        colors.add("Purple");

	        // Display all colors
	        System.out.println("List of Colors:");
	        for (String color : colors) {
	            System.out.println(color);
	        }

	        // Search for the color "Red"
	        String searchColor = "Red";
	        if (colors.contains(searchColor)) {
	            System.out.println("\nThe color \"" + searchColor + "\" is available in the list.");
	        } else {
	            System.out.println("\nThe color \"" + searchColor + "\" is NOT available in the list.");
	        }
	    }
	}


