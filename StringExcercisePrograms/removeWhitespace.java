package A1;

public class removeWhitespace {

    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s", "");
    }

    public static void main(String[] args) {
        String input = "  AIET   College  Belagavi ";
        System.out.println("Original: '" + input + "'");
        System.out.println("Without whitespace: '" + removeWhitespace(input) + "'");
    }
}
