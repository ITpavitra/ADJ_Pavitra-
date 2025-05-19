package A1;

public class StringOperationHandling {
	
	    public static void main(String[] args) {
	        // 1. String Creation and Basic Operations
	        String str1 = "Hello";
	        String str2 = "World";
	        System.out.println("String 1: " + str1);
	        System.out.println("String 2: " + str2);

	        // 2. Length and Character Access
	        System.out.println("Length of str1: " + str1.length());
	        System.out.println("Character at index 1 of str1: " + str1.charAt(1));

	        // 3. String Comparison
	        System.out.println("str1 equals str2: " + str1.equals(str2));
	        System.out.println("str1 equalsIgnoreCase 'hello': " + str1.equalsIgnoreCase("hello"));

	        // 4. String Searching
	        String sentence = "Welcome to AIET";
	        System.out.println("Index of 'AIET': " + sentence.indexOf("AIET"));
	        System.out.println("Does sentence contain 'to'? " + sentence.contains("to"));

	        // 5. Substring Operations
	        System.out.println("Substring from index 8: " + sentence.substring(8));
	        System.out.println("Substring from index 8 to 12: " + sentence.substring(8, 12));

	        // 6. String Modification
	        String modified = sentence.replace("AIET", "Java");
	        System.out.println("Modified sentence: " + modified);

	        // 7. Whitespace Handling
	        String withSpaces = "   Learn Java   ";
	        System.out.println("Before trim: '" + withSpaces + "'");
	        System.out.println("After trim: '" + withSpaces.trim() + "'");

	        // 8. String Concatenation
	        String fullString = str1 + " " + str2;
	        System.out.println("Concatenated String: " + fullString);

	        // 9. String Splitting
	        String fruits = "apple,banana,grape";
	        String[] fruitArray = fruits.split(",");
	        System.out.println("Splitted fruits:");
	        for (String fruit : fruitArray) {
	            System.out.println(fruit);
	        }

	        // 10. StringBuilder Demo
	        StringBuilder sb = new StringBuilder("Hello");
	        sb.append(" AIET");
	        sb.insert(0, "Welcome ");
	        sb.replace(8, 13, "to");
	        sb.delete(0, 8);
	        System.out.println("StringBuilder Result: " + sb.toString());

	        // 11. String Formatting
	        String name = "Pavitra";
	        int age = 21;
	        String formatted = String.format("Name: %s | Age: %d", name, age);
	        System.out.println("Formatted Output: " + formatted);

	        // 12. Email Validation using contains(), startsWith(), endsWith()
	        String email = "student@aiet.edu";
	        boolean isValidEmail = email.contains("@") && email.startsWith("student") && email.endsWith(".edu");
	        System.out.println("Email: " + email);
	        System.out.println("Is valid email: " + isValidEmail);
	    }
	}
