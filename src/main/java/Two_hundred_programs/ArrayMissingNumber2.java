package Two_hundred_programs;

public class ArrayMissingNumber2 {
    public static void main(String[] args) {
        int[] a={1,2,3,5,6}, n=6, sum=n*(n+1)/2;
        for(int x:a)sum-=x; System.out.println(sum);
    }
}
