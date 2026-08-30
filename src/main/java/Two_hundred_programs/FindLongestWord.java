package Two_hundred_programs;

public class FindLongestWord {
    public static void main(String[] args) {
        String s = "The quick brown fox jumped";
        String longest = "";
        for (String w : s.split(" ")) if (w.length() > longest.length()) longest = w;
        System.out.println("Longest word: " + longest);
    }
}