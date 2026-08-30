package Two_hundred_programs1;

public class NumberReverse {
    public static void main(String[] args) {
        int n=12345, r=0, x=n;
        while(x!=0) { r=r*10+x%10; x/=10; }
        System.out.println(r);
    }
}
