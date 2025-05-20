package java1;
import java.util.*;
public class truncate {
	
	
	  static String truncate(String str, int len) {
	    if (str.length() <= len) return str;
	    return str.substring(0, len) + "...";
	  }
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    int len = sc.nextInt();
	    System.out.println(truncate(str, len));
	  }
	}
