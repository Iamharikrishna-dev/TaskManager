package Two_hundred_programs;

public class RemoveDuplicateChars {
    public static void main(String[] args) {
        String s = "programming";
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) if (sb.indexOf(String.valueOf(c)) < 0) sb.append(c);
        System.out.println(sb);
    }
}