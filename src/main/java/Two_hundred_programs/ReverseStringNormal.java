package Two_hundred_programs;

import java.util.*;
public class ReverseStringNormal {
    public static void main(String[] args) {
        String s = "Hello Java";
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) rev += s.charAt(i);
        System.out.println(rev);
    }
}
