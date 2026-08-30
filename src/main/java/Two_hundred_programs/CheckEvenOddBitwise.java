package Two_hundred_programs;

public class CheckEvenOddBitwise {
    public static void main(String[] args) {
        int n = 42;
        System.out.println((n & 1) == 0 ? n + " is Even" : n + " is Odd");
    }
}