package A1;
import java.util.LinkedList;
import java.util.Collections;
public class swapList {



	    public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>();
	        list.add("Red");
	        list.add("Green");
	        list.add("Blue");
	        list.add("Yellow");

	        System.out.println("Before swap: " + list);

	        Collections.swap(list, 0, 2); // swap 1st and 3rd (index 0 and 2)

	        System.out.println("After swapping 1st and 3rd: " + list);
	    }
	}
