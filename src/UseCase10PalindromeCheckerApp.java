import java.util.Scanner;

public class UseCase10PalindromeCheckerApp {

    // Method to check palindrome ignoring spaces and case
    public static boolean isPalindrome(String input) {

        // Normalize the string
        // Remove all spaces using regex and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Convert string to char array
        char[] arr = normalized.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        // Check palindrome
        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The given string is a palindrome (ignoring spaces and case).");
        } else {
            System.out.println("The given string is NOT a palindrome.");
        }

        sc.close();
    }
}