import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class Q8 {
    public static void main(String[] args) {
        //Write a Java program to find the second smallest and largest elements in a list of integers using streams.
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int secondSmallest = list.stream().sorted().distinct().skip(1).findFirst().orElse(0);
        int secondLargest = list.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().orElse(0);
        System.out.println("Second Smallest: " + secondSmallest);
        System.out.println("Second Largest: " + secondLargest);
    }
}
