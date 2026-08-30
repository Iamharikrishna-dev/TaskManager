package Two_hundred_programs;

import java.util.*;
import java.util.stream.*;
public class StreamGroupingByExample {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "avocado", "blueberry", "cherry", "cranberry");
        Map<Character, List<String>> grouped = words.stream()
                .collect(Collectors.groupingBy(w -> w.charAt(0)));
        System.out.println(grouped);
    }
}
