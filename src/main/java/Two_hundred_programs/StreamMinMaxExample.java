package Two_hundred_programs;

import java.util.*;
public class StreamMinMaxExample {
    public static void main(String[] args) {
        List<Integer> nums = List.of(12, 45, 3, 67, 21, 9);
        Optional<Integer> min = nums.stream().min(Integer::compareTo);
        Optional<Integer> max = nums.stream().max(Integer::compareTo);
        System.out.println("Min: " + min.get());
        System.out.println("Max: " + max.get());
    }
}
