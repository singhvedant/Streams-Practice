import java.util.Arrays;
import java.util.List;

public class Q5 {
    public static void main(String[] args) {
        //Write a Java program to count the number of strings in a list that start with a specific letter using streams.
        List<String> list = Arrays.asList("apple", "banana", "avocado", "orange", "pear", "plum");
        long count = list.stream().filter(s -> s.startsWith("a")).count();
        System.out.println("Count: " + count);
    }
}
