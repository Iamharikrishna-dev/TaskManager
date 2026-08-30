package Two_hundred_programs1;

import java.util.*;
public class DuplicateCharacterCount {
    public static void main(String[] args) {
        String s = "programming";
        Map<Character,Integer> m = new LinkedHashMap<>();
        for (char c : s.toCharArray()) m.put(c, m.getOrDefault(c,0)+1);
        for (Map.Entry<Character,Integer> e : m.entrySet())
            if (e.getValue() > 1) System.out.println(e.getKey()+" = "+e.getValue());
    }
}
