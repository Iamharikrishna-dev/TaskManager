package Two_hundred_programs;

import java.util.*;
import java.util.stream.*;
public class StreamSortedStringsExample {
    public static void main(String[] args) {
        List<String> names = List.of("Charlie", "alice", "Bob", "dave");
        List<String> sorted = names.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.toList());
        System.out.println(sorted);
    }
}
