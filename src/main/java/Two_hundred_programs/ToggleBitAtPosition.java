package Two_hundred_programs;

public class ToggleBitAtPosition {
    public static void main(String[] args) {
        int n = 10, pos = 0;
        int result = n ^ (1 << pos);
        System.out.println("Result: " + result);
    }
}