import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q4 {
    public static void main(String[] args) {
        //Write a Java program to remove all duplicate elements from a list using streams.
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5);
        List<Integer> distinctElements = list.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct elements: " + distinctElements);
    }
}
