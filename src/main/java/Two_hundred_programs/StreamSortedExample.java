package Two_hundred_programs;

import java.util.*;
import java.util.stream.*;
public class StreamSortedExample {
    public static void main(String[] args) {
        List<Integer> nums = List.of(5, 3, 8, 1, 9, 2);
        List<Integer> sorted = nums.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted);
        List<Integer> desc = nums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(desc);
    }
}
