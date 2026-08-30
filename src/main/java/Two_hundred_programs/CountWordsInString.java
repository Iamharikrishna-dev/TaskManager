package Two_hundred_programs;

public class CountWordsInString {
    public static void main(String[] args) {
        String s = "This is a sample sentence";
        System.out.println("Word count: " + s.trim().split("\\s+").length);
    }
}