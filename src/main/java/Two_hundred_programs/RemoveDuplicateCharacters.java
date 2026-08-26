package Two_hundred_programs;

import java.util.*;
public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String s = "programming";
        StringBuilder out = new StringBuilder();
        Set<Character> set = new LinkedHashSet<>();
        for (char c : s.toCharArray()) if (set.add(c)) out.append(c);
        System.out.println(out);
    }
}
