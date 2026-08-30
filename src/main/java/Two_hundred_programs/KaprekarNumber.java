package Two_hundred_programs;

public class KaprekarNumber {
    public static void main(String[] args) {
        int n = 45;
        long sq = (long) n * n;
        String s = String.valueOf(sq);
        for (int cut = 1; cut < s.length(); cut++) {
            long left = s.substring(0, cut).isEmpty() ? 0 : Long.parseLong(s.substring(0, cut));
            long right = Long.parseLong(s.substring(cut));
            if (right != 0 && left + right == n) { System.out.println(n + " is Kaprekar"); return; }
        }
        System.out.println(n + " is not Kaprekar");
    }
}