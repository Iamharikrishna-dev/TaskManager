package Two_hundred_programs;

public class PowerWithoutMathPow {
    public static void main(String[] args) {
        int base = 3, exp = 5, result = 1;
        for (int i = 0; i < exp; i++) result *= base;
        System.out.println(base + "^" + exp + " = " + result);
    }
}