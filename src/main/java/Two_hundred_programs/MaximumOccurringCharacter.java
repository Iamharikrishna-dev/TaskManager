package Two_hundred_programs;

import java.util.*;
public class MaximumOccurringCharacter {
    public static void main(String[] args) {
        String s="success"; Map<Character,Integer> m=new HashMap<>();
        for(char c:s.toCharArray()) m.put(c,m.getOrDefault(c,0)+1);
        char best=s.charAt(0);
        for(char c:m.keySet()) if(m.get(c)>m.get(best)) best=c;
        System.out.println(best+" = "+m.get(best));
    }
}
