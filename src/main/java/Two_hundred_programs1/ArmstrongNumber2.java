package Two_hundred_programs1;

public class ArmstrongNumber2 {
    public static void main(String[] args) {
        int n=153, x=n, sum=0, d=String.valueOf(n).length();
        while(x!=0) { int q=x%10; sum+=(int)Math.pow(q,d); x/=10; }
        System.out.println(sum==n ? "Armstrong" : "Not Armstrong");
    }
}
