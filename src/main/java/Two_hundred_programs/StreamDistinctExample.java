package Two_hundred_programs;

import java.util.*;
import java.util.stream.*;
public class StreamDistinctExample {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 2, 3, 3, 3, 4, 5, 5);
        List<Integer> distinct = nums.stream().distinct().collect(Collectors.toList());
        System.out.println(distinct);
    }
}
