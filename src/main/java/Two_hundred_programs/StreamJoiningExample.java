package Two_hundred_programs;

import java.util.*;
import java.util.stream.*;
public class StreamJoiningExample {
    public static void main(String[] args) {
        List<String> items = List.of("bread", "milk", "eggs", "butter");
        String result = items.stream().collect(Collectors.joining(", ", "[", "]"));
        System.out.println(result);
    }
}
