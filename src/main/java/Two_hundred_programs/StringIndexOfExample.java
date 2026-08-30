package Two_hundred_programs;

public class StringIndexOfExample {
    public static void main(String[] args) {
        String s = "the quick brown fox jumps over the lazy dog";
        System.out.println("First 'the': " + s.indexOf("the"));
        System.out.println("Last 'the': " + s.lastIndexOf("the"));
        System.out.println("'fox' at: " + s.indexOf("fox"));
    }
}
