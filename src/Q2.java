import java.util.Arrays;
import java.util.List;

public class Q2 {
    public static void main(String[] args) {
        //Write a Java program to convert a list of strings to uppercase or lowercase using streams.
        List<String> list = Arrays.asList("The", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog");
        System.out.println("Uppercase: ");
        list.stream().map(String::toUpperCase).forEach(System.out::println);
        System.out.println("Lowercase: ");
        list.stream().map(String::toLowerCase).forEach(System.out::println);
    }
}
