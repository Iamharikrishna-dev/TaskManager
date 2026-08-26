package Two_hundred_programs;

public class CountWords {
    public static void main(String[] args) {
        String s="Java is easy to learn";
        String t=s.trim();
        System.out.println(t.isEmpty()?0:t.split("\\s+").length);
    }
}
