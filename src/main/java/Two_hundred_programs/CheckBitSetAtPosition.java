package Two_hundred_programs;

public class CheckBitSetAtPosition {
    public static void main(String[] args) {
        int n = 10, pos = 1;
        boolean isSet = (n & (1 << pos)) != 0;
        System.out.println("Bit " + pos + " set: " + isSet);
    }
}