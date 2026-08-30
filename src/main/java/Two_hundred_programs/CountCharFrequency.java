package Two_hundred_programs;

public class CountCharFrequency {
    public static void main(String[] args) {
        String s = "mississippi";
        java.util.Map<Character,Integer> freq = new java.util.LinkedHashMap<>();
        for (char c : s.toCharArray()) freq.merge(c, 1, Integer::sum);
        System.out.println(freq);
    }
}