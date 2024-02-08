import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q6 {
    public static void main(String[] args) {
        //Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.
        List<String> list = Arrays.asList("banana", "apple", "orange", "grape", "watermelon");
        System.out.println("Ascending order: ");
        list.stream().sorted().forEach(System.out::println);
        System.out.println("Descending order: ");
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
