package Two_hundred_programs;

import java.util.*;
public class ArrayLargest {
    public static void main(String[] args) {
        int[] a={10,5,30,20}; int max=a[0]; for(int x:a) max=Math.max(max,x); System.out.println(max);
    }
}
