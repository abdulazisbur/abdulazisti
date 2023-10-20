import java.util.*;

public class balikan {
    public static void main(String args[]) {
     try (Scanner scanner = new Scanner(System.in)) {
        // Get the word from the user.
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();
        // Reverse the word.
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }
        // Print the reversed word.
        System.out.println("The reversed word is: " + reversedWord);
    }
}

}
