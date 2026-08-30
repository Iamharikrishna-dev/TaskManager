package Two_hundred_programs;

import java.util.*;
public class StreamCountExample {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "kiwi", "avocado", "cherry");
        long count = words.stream().filter(w -> w.startsWith("a")).count();
        System.out.println("Words starting with 'a': " + count);
    }
}
