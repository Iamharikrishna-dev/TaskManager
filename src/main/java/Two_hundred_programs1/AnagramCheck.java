package Two_hundred_programs1;

import java.util.*;
public class AnagramCheck {
    public static void main(String[] args) {
        String a = "listen", b = "silent";
        char[] x=a.toCharArray(), y=b.toCharArray();
        Arrays.sort(x); Arrays.sort(y);
        System.out.println(Arrays.equals(x,y) ? "Anagram" : "Not Anagram");
    }
}
