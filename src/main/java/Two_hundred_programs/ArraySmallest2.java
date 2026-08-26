package Two_hundred_programs;

public class ArraySmallest2 {
    public static void main(String[] args) {
        int[] a={10,5,30,20}; int min=a[0]; for(int x:a) min=Math.min(min,x); System.out.println(min);
    }
}
