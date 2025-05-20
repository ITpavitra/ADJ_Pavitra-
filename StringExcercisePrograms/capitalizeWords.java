package java1;
import java.util.*;
import java.util.Scanner;
public class capitalizeWords {


	  static String capitalizeWords(String str) {
	    String[] words = str.split(" ");
	    StringBuilder sb = new StringBuilder();
	    for (String word : words)
	      sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
	    return sb.toString().trim();
	  }
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String input = sc.nextLine();
	    System.out.println(capitalizeWords(input));
	  }
	}
