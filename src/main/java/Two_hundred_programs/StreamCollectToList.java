package Two_hundred_programs;

import java.util.*;
import java.util.stream.*;
public class StreamCollectToList {
    public static void main(String[] args) {
        List<String> names = List.of("bob", "alice", "carl");
        List<String> upper = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upper);
    }
}
