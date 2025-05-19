package A1;
import java.util.*;
public class ListOperations {
		  public static void main(String[] args) {
		        List<String> arrayList = new ArrayList<>();
		        List<String> linkedList = new LinkedList<>();
		        System.out.print("ArrayList Operations:");
		        performOperations(arrayList);
		        System.out.println("\nLinkedList Operations:");
		        performOperations(linkedList);
		    }
		    public static void performOperations(List<String> list) {
		        // 1. Adding elements
		        list.add("Apple");
		        list.add("Banana");
		        list.add("Orange");
		        System.out.println("1. Added Elements: " + list);

		        // 2. Adding element at specific index
		        list.add(1, "Grapes");
		        System.out.print("2. After adding 'Grapes' at index 1: " + list);

		        // 3. Adding multiple elements
		        List<String> moreFruits = Arrays.asList("Pineapple", "Mango");
		        list.addAll(moreFruits);
		        System.out.print("3. After adding multiple elements: " + list);

		        // 4. Accessing elements
		        System.out.println("4. Element at index 2: " + list.get(2));

		        // 5. Updating elements
		        list.set(2, "Kiwi");
		        System.out.println("5. After updating index 2 to 'Kiwi': " + list);

		        // 6. Removing elements
		        list.remove("Banana");
		        System.out.println("6. After removing 'Banana': " + list);

		        // 7. Searching elements
		        boolean found = list.contains("Orange");
		        System.out.println("7. Searching for 'Orange': " + (found ? "Found" : "Not Found"));

		        // 8. List size
		        System.out.println("8. List size: " + list.size());

		        // 9. Iterating over list (for-each loop)
		        System.out.print("9. Iterating using for-each: ");
		        for (String fruit : list) {
		            System.out.print(fruit + " ");
		        }
		        System.out.println();

		        // 10. Using Iterator
		        System.out.print("10. Iterating using Iterator: ");
		        Iterator<String> iterator = list.iterator();
		        while (iterator.hasNext()) {
		            System.out.print(iterator.next() + " ");
		        }
		        System.out.println();

		        // 11. Sorting
		        Collections.sort(list);
		        System.out.print("11. After sorting: " + list);

		        // 12. Sublist
		        List<String> sublist = list.subList(1, 4);  // exclusive of end index
		        System.out.print("12. Sublist from index 1 to 3: " + sublist);

		        // 13. Clearing the list
		        list.clear();
		        System.out.print("13. After clearing the list: " + list);
		    }
		}




