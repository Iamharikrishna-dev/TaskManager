package Two_hundred_programs;

import java.util.*;
public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1); map.put("b", 2); map.put("c", 3);
        for (Map.Entry<String, Integer> e : map.entrySet())
            System.out.println(e.getKey() + " = " + e.getValue());
    }
}