import java.util.Arrays;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        //Write a Java program to calculate the average of a list of integers using streams.
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        double average = list.stream().mapToInt(i -> i).average().orElse(0.0);
        System.out.println("Average: " + average);
    }
}
