package java1;
import java.util.*;
public class countWords {

	
	  static int countWords(String str) {
	    if (str == null || str.trim().isEmpty()) return 0;
	    return str.trim().split("\\s+").length;
	  }
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String input = sc.nextLine();
	    System.out.println(countWords(input));
	  }
	}
