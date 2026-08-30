package Two_hundred_programs;

public class AutomorphicNumber {
    public static void main(String[] args) {
        int n = 25;
        long sq = (long) n * n;
        System.out.println(String.valueOf(sq).endsWith(String.valueOf(n)) ? n + " is Automorphic" : n + " is not");
    }
}