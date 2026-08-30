package Two_hundred_programs;

public class StringTrimStripExample {
    public static void main(String[] args) {
        String s = "   Hello Java   ";
        System.out.println("[" + s.trim() + "]");
        System.out.println("[" + s.strip() + "]");
        System.out.println("[" + s.stripLeading() + "]");
        System.out.println("[" + s.stripTrailing() + "]");
    }
}
