package Two_hundred_programs1;

public class PrimeCheck3 {
    public static void main(String[] args) {
        int n=29; boolean prime=n>1;
        for(int i=2;i*i<=n&&prime;i++) if(n%i==0) prime=false;
        System.out.println(prime ? "Prime" : "Not Prime");
    }
}
