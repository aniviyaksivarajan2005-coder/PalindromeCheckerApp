import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word to check: ");
        String original = scanner.nextLine();

        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        if (original.equals(reversed)) {
            System.out.println("Result: " + original + " is a Palindrome");
        } else {
            System.out.println("Result: " + original + " is NOT a Palindrome");
        }

        scanner.close();
    }
}