package Two_hundred_programs;

public class SetBitAtPosition {
    public static void main(String[] args) {
        int n = 10, pos = 1;
        int result = n | (1 << pos);
        System.out.println("Result: " + result);
    }
}