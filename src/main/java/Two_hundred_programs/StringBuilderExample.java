package Two_hundred_programs;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello").append(", ").append("World!");
        sb.insert(0, ">> ");
        sb.replace(3, 8, "Hi");
        System.out.println(sb);
    }
}