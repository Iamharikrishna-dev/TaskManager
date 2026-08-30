package Two_hundred_programs;

public class StringBufferAppendInsertExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java Programming");
        sb.append(" Language");
        sb.insert(4, "(TM)");
        System.out.println(sb);
    }
}
