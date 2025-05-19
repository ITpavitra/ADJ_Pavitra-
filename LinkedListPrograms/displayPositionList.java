package A1;
import java.util.LinkedList;
public class displayPositionList {


	
	    public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>();
	        list.add("Red");
	        list.add("Green");
	        list.add("Blue");
	        list.add("Yellow");

	        System.out.println("Elements with their positions:");
	        for (int i = 0; i < list.size(); i++) {
	            System.out.println("Position " + i + ": " + list.get(i));
	        }
	    }
	}
