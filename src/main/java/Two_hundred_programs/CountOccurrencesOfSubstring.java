package Two_hundred_programs;

public class CountOccurrencesOfSubstring {
    public static void main(String[] args) {
        String s = "abababab", sub = "ab";
        int count = 0, idx = 0;
        while ((idx = s.indexOf(sub, idx)) != -1) { count++; idx += sub.length(); }
        System.out.println("Occurrences: " + count);
    }
}