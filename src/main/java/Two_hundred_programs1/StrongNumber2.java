package Two_hundred_programs1;

public class StrongNumber2 {
    public static void main(String[] args) {
        int n=145,x=n,sum=0; while(x!=0) {int d=x%10,f=1;for(int i=2;i<=d;i++)f*=i;sum+=f;x/=10;}
        System.out.println(sum==n ? "Strong" : "Not Strong");
    }
}
