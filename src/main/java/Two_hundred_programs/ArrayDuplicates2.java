package Two_hundred_programs;

import java.util.*;
public class ArrayDuplicates2 {
    public static void main(String[] args) {
        int[] a={1,2,3,2,4,1,5}; Set<Integer> seen=new HashSet<>();
        for(int x:a) if(!seen.add(x)) System.out.print(x+" ");
    }
}
