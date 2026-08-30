package Two_hundred_programs1;

public class SmallestDigit {
    public static void main(String[] args) {
        int n=58329,min=9; while(n!=0) {min=Math.min(min,n%10);n/=10;} System.out.println(min);
    }
}
