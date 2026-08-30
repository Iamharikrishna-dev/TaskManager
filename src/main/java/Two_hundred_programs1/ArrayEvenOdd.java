package Two_hundred_programs1;

public class ArrayEvenOdd {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6}; for(int x:a)if(x%2==0)System.out.print(x+" ");
        System.out.println(); for(int x:a)if(x%2!=0)System.out.print(x+" ");
    }
}
