package A1;
import java.util.LinkedList;
import java.util.Iterator;
public class reverseList {


	    public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>();
	        list.add("Red");
	        list.add("Green");
	        list.add("Blue");
	        list.add("Yellow");

	        System.out.println("Reverse iteration:");
	        Iterator<String> reverseIterator = list.descendingIterator();

	        while (reverseIterator.hasNext()) {
	            System.out.println(reverseIterator.next());
	        }
	    }
	}
