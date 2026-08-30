package Two_hundred_programs;

public class StringMatchesRegexExample {
    public static void main(String[] args) {
        String email = "user@example.com";
        String pattern = "^[\\w.]+@[\\w]+\\.[a-z]{2,}$";
        System.out.println(email.matches(pattern) ? "Valid email" : "Invalid email");
    }
}
