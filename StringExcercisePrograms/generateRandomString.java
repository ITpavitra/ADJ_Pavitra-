package java1;
import java.util.*;
public class generateRandomString {

	
	  static String generateRandomString(int len) {
	    String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	    StringBuilder sb = new StringBuilder();
	    Random r = new Random();
	    for (int i = 0; i < len; i++)
	      sb.append(chars.charAt(r.nextInt(chars.length())));
	    return sb.toString();
	  }
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int len = sc.nextInt();
	    System.out.println(generateRandomString(len));
	  }
	}

