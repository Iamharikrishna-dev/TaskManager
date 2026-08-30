package Two_hundred_programs;

public class StringBuilderToStringExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 5; i++) sb.append(i * i).append(" ");
        String result = sb.toString().trim();
        System.out.println("Squares: " + result);
    }
}
