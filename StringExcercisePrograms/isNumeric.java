package java1;
import java.util.*;
public class isNumeric {
	
	  static boolean isNumeric(String str) {
	    return str.matches("\\d+");
	  }
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    System.out.println(isNumeric(str));
	    String str1 = sc.nextLine();
	    System.out.println(isNumeric(str1));
	  }
	}
