package Two_hundred_programs;

public class ReverseEachWord {
    public static void main(String[] args) {
        String s = "keep it simple";
        StringBuilder result = new StringBuilder();
        for (String w : s.split(" ")) result.append(new StringBuilder(w).reverse()).append(" ");
        System.out.println(result.toString().trim());
    }
}