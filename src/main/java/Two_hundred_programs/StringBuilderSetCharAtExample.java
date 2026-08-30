package Two_hundred_programs;

public class StringBuilderSetCharAtExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("cat");
        sb.setCharAt(0, 'b');
        System.out.println(sb);
    }
}
