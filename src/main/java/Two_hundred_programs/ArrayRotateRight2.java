package Two_hundred_programs;

import java.util.*;
public class ArrayRotateRight2 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5}; int k=2; k%=a.length;
        int[] b=new int[a.length]; for(int i=0;i<a.length;i++)b[(i+k)%a.length]=a[i];
        System.out.println(Arrays.toString(b));
    }
}
