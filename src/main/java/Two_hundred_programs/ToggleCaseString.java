package Two_hundred_programs;

public class ToggleCaseString {
    public static void main(String[] args) {
        String s = "Hello World";
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray())
            sb.append(Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c));
        System.out.println(sb);
    }
}