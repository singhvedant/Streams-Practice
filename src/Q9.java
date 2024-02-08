import java.util.Scanner;

public class Q9 {
    // Create a program to find an input word in a input string.
    // IF the word is found, give the frequency of the word else throw a custom exception "Word not found".
    public static void main(String[] args) throws WordNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.println("Enter a word to find: ");
        String word = scanner.nextLine();
        int frequency = 0;
        for (String s : inputString.split(" ")) {
            if (s.equals(word)) {
                frequency++;
            }
        }
        if (frequency == 0) {
            throw new WordNotFoundException("Word not found");
        }
        System.out.println("Frequency of " + word + " is " + frequency);
    }
}
