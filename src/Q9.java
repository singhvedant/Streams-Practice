import java.util.Scanner;

public class Q9 {
    // Create a program to find an input word in a input string.
    // IF the word is found, print "Word found" else throw a custom exception "Word not found".
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the line:");
        String input = scanner.nextLine();
        System.out.println("Input the word:");
        String word =  scanner.nextLine();
        try {
            if (input.contains(word)) {
                System.out.println("Word found");
            } else {
                throw new WordNotFoundException("Word not found");
            }
        } catch (WordNotFoundException e) {
            System.out.println(e);
        }
    }
}
