import java.util.Arrays;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        //Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int sumEven = list.stream().filter(i -> i % 2 == 0).reduce(0, Integer::sum);
        int sumOdd = list.stream().filter(i -> i % 2 != 0).reduce(0, Integer::sum);
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
    }
}
