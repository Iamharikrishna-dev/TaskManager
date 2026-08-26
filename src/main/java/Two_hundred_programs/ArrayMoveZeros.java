package Two_hundred_programs;

import java.util.*;
public class ArrayMoveZeros {
    public static void main(String[] args) {
        int[] a={0,1,0,3,12}; int p=0;
        for(int x:a)if(x!=0)a[p++]=x; while(p<a.length)a[p++]=0;
        System.out.println(Arrays.toString(a));
    }
}
