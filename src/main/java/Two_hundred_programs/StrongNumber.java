package Two_hundred_programs;

public class StrongNumber {
    static int fact(int n) { return n <= 1 ? 1 : n * fact(n - 1); }
    public static void main(String[] args) {
        int n = 145, temp = n, sum = 0;
        while (temp > 0) { sum += fact(temp % 10); temp /= 10; }
        System.out.println(sum == n ? n + " is Strong" : n + " is not Strong");
    }
}