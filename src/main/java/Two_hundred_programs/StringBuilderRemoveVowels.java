package Two_hundred_programs;

public class StringBuilderRemoveVowels {
    public static void main(String[] args) {
        String s = "Programming in Java is enjoyable";
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) < 0) sb.append(c);
        }
        System.out.println(sb);
    }
}
