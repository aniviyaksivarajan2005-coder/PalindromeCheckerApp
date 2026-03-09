import java.util.Scanner;

public class PalindromeCheckerApp {

    public static boolean isPalindromeRecursive(String str, int start, int end) {

        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        boolean result = isPalindromeRecursive(input, 0, input.length() - 1);

        if (result)
            System.out.println("Result: " + input + " is a Palindrome");
        else
            System.out.println("Result: " + input + " is NOT a Palindrome");

        scanner.close();
    }
}