import java.util.Scanner;

class StringManipulator {
    private String text;

    // Constructor
    public StringManipulator(String text) {
        this.text = text;
    }

    // Convert to uppercase
    public String toUpper() {
        return text.toUpperCase();
    }

    // Convert to lowercase
    public String toLower() {
        return text.toLowerCase();
    }

    // Reverse string
    public String reverse() {
        StringBuilder sb = new StringBuilder(text);
        return sb.reverse().toString();
    }

    // Concatenate another string
    public String concatenate(String anotherString) {
        return text + anotherString;
    }
}

public class co2p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your string: ");
        String input = sc.nextLine();

        StringManipulator obj = new StringManipulator(input);

        System.out.println("Uppercase: " + obj.toUpper());
        System.out.println("Lowercase: " + obj.toLower());
        System.out.println("Reversed: " + obj.reverse());

        System.out.print("Enter string to concatenate: ");
        String concatStr = sc.nextLine();
        System.out.println("Concatenated String: " + obj.concatenate(concatStr));

        sc.close();
    }
}
