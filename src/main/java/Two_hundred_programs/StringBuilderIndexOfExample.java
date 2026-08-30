package Two_hundred_programs;

public class StringBuilderIndexOfExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("the quick brown fox");
        System.out.println("Index of 'brown': " + sb.indexOf("brown"));
        System.out.println("Substring: " + sb.substring(4, 9));
    }
}
