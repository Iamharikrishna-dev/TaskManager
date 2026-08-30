package Two_hundred_programs1;

public class DigitCount2 {
    public static void main(String[] args) {
        int n=123450,c=0; do {c++;n/=10;} while(n!=0); System.out.println(c);
    }
}
