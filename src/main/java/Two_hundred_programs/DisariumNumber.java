package Two_hundred_programs;

public class DisariumNumber {
    public static void main(String[] args) {
        int n = 135, temp = n, sum = 0;
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++) sum += Math.pow(s.charAt(i) - '0', i + 1);
        System.out.println(sum == n ? n + " is Disarium" : n + " is not Disarium");
    }
}