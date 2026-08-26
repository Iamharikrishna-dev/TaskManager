package Two_hundred_programs;

public class GCD2 {
    public static void main(String[] args) {
        int a=48,b=18; while(b!=0) {int t=a%b;a=b;b=t;} System.out.println(a);
    }
}
