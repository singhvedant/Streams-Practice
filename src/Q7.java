import java.util.Arrays;
import java.util.List;

public class Q7 {
    public static void main(String[] args) {
        //Write a Java program to find the maximum and minimum values in a list of integers using streams.
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int max = list.stream().mapToInt(i -> i).max().orElse(0);
        int min = list.stream().mapToInt(i -> i).min().orElse(0);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
