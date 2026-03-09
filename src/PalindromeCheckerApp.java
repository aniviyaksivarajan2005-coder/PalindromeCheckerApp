import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Palindrome Checker App");

        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        PalindromeStrategy stackStrategy = new StackStrategy();
        PalindromeStrategy dequeStrategy = new DequeStrategy();

        long startTime;
        long endTime;

        // Stack Strategy Timing
        startTime = System.nanoTime();
        boolean stackResult = stackStrategy.checkPalindrome(input);
        endTime = System.nanoTime();
        long stackTime = endTime - startTime;

        // Deque Strategy Timing
        startTime = System.nanoTime();
        boolean dequeResult = dequeStrategy.checkPalindrome(input);
        endTime = System.nanoTime();
        long dequeTime = endTime - startTime;

        System.out.println("\nResults:");

        System.out.println("Stack Strategy Result: " + stackResult);
        System.out.println("Stack Execution Time: " + stackTime + " ns");

        System.out.println("\nDeque Strategy Result: " + dequeResult);
        System.out.println("Deque Execution Time: " + dequeTime + " ns");

        scanner.close();
    }
}