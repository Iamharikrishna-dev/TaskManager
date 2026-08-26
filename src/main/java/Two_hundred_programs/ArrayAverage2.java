package Two_hundred_programs;

public class ArrayAverage2 {
    public static void main(String[] args) {
        int[] a={10,20,30,40}; int sum=0; for(int x:a)sum+=x;
        System.out.println((double)sum/a.length);
    }
}
