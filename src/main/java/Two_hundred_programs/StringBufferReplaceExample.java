package Two_hundred_programs;

public class StringBufferReplaceExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("I like cats");
        sb.replace(7, 11, "dogs");
        System.out.println(sb);
    }
}
