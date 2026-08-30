package Two_hundred_programs;

public class CountUppercaseLowercase {
    public static void main(String[] args) {
        String s = "Hello World From Java";
        int upper = 0, lower = 0;
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) upper++;
            else if (Character.isLowerCase(c)) lower++;
        }
        System.out.println("Upper: " + upper + " Lower: " + lower);
    }
}