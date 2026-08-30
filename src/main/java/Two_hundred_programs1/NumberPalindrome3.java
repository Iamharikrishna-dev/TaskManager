package Two_hundred_programs1;

public class NumberPalindrome3 {
    public static void main(String[] args) {
        int n=1221, x=n, r=0;
        while(x!=0) { r=r*10+x%10; x/=10; }
        System.out.println(n==r ? "Palindrome" : "Not Palindrome");
    }
}
