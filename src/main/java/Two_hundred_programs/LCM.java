package Two_hundred_programs;

public class LCM {
    public static void main(String[] args) {
        int a=12,b=18,x=a,y=b; while(y!=0) {int t=x%y;x=y;y=t;}
        System.out.println(a/gcd(a,b)*b);
    }
    static int gcd(int a,int b) { while(b!=0) {int t=a%b;a=b;b=t;} return a; }
}
