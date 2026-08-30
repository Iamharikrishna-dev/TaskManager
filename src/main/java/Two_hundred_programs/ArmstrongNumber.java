package Two_hundred_programs;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 153, temp = n, sum = 0;
        int digits = String.valueOf(n).length();
        while (temp > 0) {
            int d = temp % 10;
            sum += Math.pow(d, digits);
            temp /= 10;
        }
        System.out.println(sum == n ? n + " is Armstrong" : n + " is not Armstrong");
    }
}