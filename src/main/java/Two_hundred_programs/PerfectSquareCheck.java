package Two_hundred_programs;

public class PerfectSquareCheck {
    public static void main(String[] args) {
        int n = 49;
        int root = (int) Math.sqrt(n);
        System.out.println(root * root == n ? n + " is a perfect square" : n + " is not a perfect square");
    }
}