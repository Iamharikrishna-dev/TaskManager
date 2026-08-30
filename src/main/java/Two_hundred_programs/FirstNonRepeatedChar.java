package Two_hundred_programs;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String s = "swiss";
        java.util.Map<Character,Integer> freq = new java.util.LinkedHashMap<>();
        for (char c : s.toCharArray()) freq.merge(c, 1, Integer::sum);
        for (char c : s.toCharArray()) if (freq.get(c) == 1) { System.out.println(c); return; }
        System.out.println("None");
    }
}