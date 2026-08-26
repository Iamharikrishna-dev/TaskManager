package Two_hundred_programs;

public class LargestDigit {
    public static void main(String[] args) {
        int n=58329,max=0; while(n!=0) {max=Math.max(max,n%10);n/=10;} System.out.println(max);
    }
}
