package A1;
import java.util.LinkedList;
import java.util.ListIterator;
public class iterateList {


	    public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>();
	        list.add("Red");
	        list.add("Green");
	        list.add("Blue");
	        list.add("Yellow");

	        System.out.println("Iterating from 2nd element:");
	        ListIterator<String> iterator = list.listIterator(1); // starts from index 1

	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	}
