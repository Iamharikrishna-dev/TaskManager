package Two_hundred_programs;

import java.util.*;
public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("banana", 2); map.put("apple", 1); map.put("cherry", 3);
        System.out.println(map);
    }
}