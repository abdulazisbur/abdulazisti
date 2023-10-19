import java.util.Scanner;
public class palindromme {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Get the word from the user.
            System.out.println("Enter a word: ");
            String word = scanner.nextLine();
            // Check if the word is a palindrome.
            boolean isPalindrome = true;
            for (int i = 0; i < word.length() / 2; i++) {
                if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                    isPalindrome = false;
                    break;
                }
            }
            // Print the result.
            if (isPalindrome) {
                System.out.println("The word is a palindrome.");
            } else {
                System.out.println("The word is not a palindrome.");
            }
        }
    }
}