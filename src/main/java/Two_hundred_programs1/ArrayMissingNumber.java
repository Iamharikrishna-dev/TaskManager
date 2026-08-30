package Two_hundred_programs1;

public class ArrayMissingNumber {
    public static void main(String[] args) {
        int[] a={1,2,3,5,6};
        int n=6;
        int sum=n*(n+1)/2;
        for(int x:a)
            sum-=x;
        System.out.println(sum);
    }
}
