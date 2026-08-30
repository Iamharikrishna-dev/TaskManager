package Two_hundred_programs;

import java.util.*;
public class StreamReduceSum {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        int sum = nums.stream().reduce(0, Integer::sum);
        int product = nums.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
