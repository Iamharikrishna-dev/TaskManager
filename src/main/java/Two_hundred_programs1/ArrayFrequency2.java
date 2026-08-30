package Two_hundred_programs1;

import java.util.*;
public class ArrayFrequency2 {
    public static void main(String[] args) {
        int[] a={1,2,2,3,1,2}; Map<Integer,Integer> m=new LinkedHashMap<>();
        for(int x:a)m.put(x,m.getOrDefault(x,0)+1); System.out.println(m);
    }
}
