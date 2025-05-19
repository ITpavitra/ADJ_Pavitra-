package A1;
public class stringHandlingFunction{
    public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // 3. String Comparison
        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase 'HELLO': " + str1.equalsIgnoreCase("HELLO"));

        // 4. String Searching
        String str3 = "Welcome to Java Programming";
        System.out.println("Index of 'Java' in str3: " + str3.indexOf("Java"));
        System.out.println("Does str3 contain 'to': " + str3.contains("to"));

        // 5. Substring Operations
        System.out.println("Substring of str3 from 11 to 15: " + str3.substring(11, 15));

        // 6. String Modification
        System.out.println("Replace 'Java' with 'Python' in str3: " + str3.replace("Java", "Python"));

        // 7. Whitespace Handling
        String strWithSpaces = "   Trim me   ";
        System.out.println("Before trim: '" + strWithSpaces + "'");
        System.out.println("After trim: '" + strWithSpaces.trim() + "'");

        // 8. String Concatenation
        String concatResult = str1.concat(" ").concat(str2);
        System.out.println("Concatenated String: " + concatResult);

        // 9. String Splitting
        String csv = "apple,banana,grape";
        String[] fruits = csv.split(",");
        System.out.println("Split result:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Welcome");
        sb.append(" to Java");
        sb.insert(0, "Hi! ");
        sb.replace(4, 11, "Everyone");
        sb.delete(16, sb.length());
        System.out.println("StringBuilder result: " + sb.toString());

        // 11. String Formatting
        String name = "Alice";
        int age = 23;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("Formatted String: " + formatted);

        // 12. Email Validation using contains(), startsWith(), endsWith()
        String email = "user@example.com";
        boolean isValidEmail = email.contains("@") && email.startsWith("user") && email.endsWith(".com");
        System.out.println("Email: " + email);
        System.out.println("Is valid email: " + isValidEmail);
    }
}
