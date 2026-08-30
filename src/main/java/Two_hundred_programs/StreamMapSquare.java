package Two_hundred_programs;

import java.util.*;
import java.util.stream.*;
public class StreamMapSquare {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        List<Integer> squares = nums.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println(squares);

    }
}
