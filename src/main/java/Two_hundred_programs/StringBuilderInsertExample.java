package Two_hundred_programs;

public class StringBuilderInsertExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        sb.insert(5, ",");
        sb.insert(0, ">> ");
        System.out.println(sb);
    }
}
