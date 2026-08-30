package Two_hundred_programs1;

import java.util.*;
public class FirstRepeatedCharacter {
    public static void main(String[] args) {
        String s = "programming";
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray())
            if (!set.add(c)) { System.out.println(c); return; }
    }
}
