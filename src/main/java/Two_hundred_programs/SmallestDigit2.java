package Two_hundred_programs;

public class SmallestDigit2 {
    public static void main(String[] args) {
        int n=58329,min=9; while(n!=0) {min=Math.min(min,n%10);n/=10;} System.out.println(min);
    }
}
