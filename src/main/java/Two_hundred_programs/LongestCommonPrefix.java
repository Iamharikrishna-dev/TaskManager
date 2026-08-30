package Two_hundred_programs;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] words = {"flower", "flow", "flight"};
        String prefix = words[0];
        for (String w : words) {
            while (!w.startsWith(prefix)) prefix = prefix.substring(0, prefix.length() - 1);
        }
        System.out.println("Prefix: " + prefix);
    }
}