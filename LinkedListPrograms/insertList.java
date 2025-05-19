package A1;
import java.util.LinkedList;
public class insertList {


	    public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>();
	        list.add("Red");
	        list.add("Green");

	        System.out.println("Before adding at end: " + list);

	        list.offerLast("Pink"); // adds at the end

	        System.out.println("After adding 'Pink' at end: " + list);
	    }
	}
