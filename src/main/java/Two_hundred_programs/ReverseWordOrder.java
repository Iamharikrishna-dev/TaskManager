package Two_hundred_programs;

public class ReverseWordOrder {
    public static void main(String[] args) {
        String[] a="Java is very easy".split("\\s+");
        for(int i=a.length-1;i>=0;i--) System.out.print(a[i]+" ");
    }
}
