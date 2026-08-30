package Two_hundred_programs;

public class StringBuilderDeleteExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello Cruel World");
        sb.delete(5, 11);
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);
    }
}
