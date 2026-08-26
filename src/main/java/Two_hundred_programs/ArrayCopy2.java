package Two_hundred_programs;

import java.util.*;
public class ArrayCopy2 {
    public static void main(String[] args) {
        int[] a={1,2,3,4}; int[] b=Arrays.copyOf(a,a.length); System.out.println(Arrays.toString(b));
    }
}
