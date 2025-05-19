package A1;
import java.util.ArrayList;
import java.util.Scanner;
public class removenthColor {


	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>();

	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Purple");

	        System.out.println("Original list: " + colors);

	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter index (n) of the element to remove: ");
	        int n = scanner.nextInt();

	        if (n >= 0 && n < colors.size()) {
	            colors.remove(n);
	            System.out.println("Updated list after removing element at index " + n + ": " + colors);
	        } else {
	            System.out.println("Invalid index. No element removed.");
	        }

	        scanner.close();
	    }
	}
