package Two_hundred_programs;

public class AnagramCheck {
    public static void main(String[] args) {
        String a = "listen", b = "silent";
        char[] c1 = a.toCharArray(), c2 = b.toCharArray();
        java.util.Arrays.sort(c1); java.util.Arrays.sort(c2);
        System.out.println(java.util.Arrays.equals(c1, c2) ? "Anagram" : "Not Anagram");
    }
}