package Two_hundred_programs;

public class SpyNumber {
    public static void main(String[] args) {
        int n = 1124, temp = n, sum = 0; long prod = 1;
        while (temp > 0) { int d = temp % 10; sum += d; prod *= d; temp /= 10; }
        System.out.println(sum == prod ? n + " is Spy" : n + " is not Spy");
    }
}