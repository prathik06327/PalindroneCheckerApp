import java.util.Scanner;
import java.util.Stack;

// Service class that encapsulates palindrome logic
class PalindromeChecker {

    // Method to check if the string is palindrome
    public boolean checkPalindrome(String input) {

        // Normalize the string
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (char c : normalized.toCharArray()) {
            stack.push(c);
        }

        // Compare characters
        for (char c : normalized.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Main application class
public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Create object of service class
        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is NOT a palindrome.");
        }

        sc.close();
    }
}