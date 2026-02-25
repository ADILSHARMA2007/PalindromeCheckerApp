import java.util.*;
public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string literal
        String word = "madam";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string using a loop
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check if original string equals reversed string
        if (word.equals(reversed)) {
            System.out.println("The string \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + word + "\" is NOT a Palindrome.");
        }
    }
}