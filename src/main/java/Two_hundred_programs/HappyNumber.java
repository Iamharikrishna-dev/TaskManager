package Two_hundred_programs;

public class HappyNumber {
    static boolean isHappy(int n) {
        java.util.Set<Integer> seen = new java.util.HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            int sum = 0;
            while (n > 0) { int d = n % 10; sum += d * d; n /= 10; }
            n = sum;
        }
        return n == 1;
    }
    public static void main(String[] args) {
        System.out.println(isHappy(19) ? "Happy" : "Not Happy");
    }
}