package Two_hundred_programs;

public class StringPermutations {
    static void permute(String prefix, String remaining) {
        if (remaining.isEmpty()) { System.out.println(prefix); return; }
        for (int i = 0; i < remaining.length(); i++)
            permute(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1));
    }
    public static void main(String[] args) {
        permute("", "abc");
    }
}