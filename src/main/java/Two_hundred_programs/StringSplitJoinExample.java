package Two_hundred_programs;

import java.util.*;
public class StringSplitJoinExample {
    public static void main(String[] args) {
        String csv = "apple,banana,cherry,date";
        String[] parts = csv.split(",");
        System.out.println("Parts: " + Arrays.toString(parts));
        String joined = String.join(" | ", parts);
        System.out.println("Joined: " + joined);
    }
}
