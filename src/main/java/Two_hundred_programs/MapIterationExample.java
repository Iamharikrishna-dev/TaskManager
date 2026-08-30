package Two_hundred_programs;

import java.util.*;
public class MapIterationExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new LinkedHashMap<>();
        scores.put("Alice", 90); scores.put("Bob", 85);
        scores.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}