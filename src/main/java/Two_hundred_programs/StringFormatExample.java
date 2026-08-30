package Two_hundred_programs;

public class StringFormatExample {
    public static void main(String[] args) {
        String name = "Alice";
        int age = 30;
        double score = 92.567;
        String result = String.format("Name: %s, Age: %d, Score: %.2f", name, age, score);
        System.out.println(result);
    }
}
