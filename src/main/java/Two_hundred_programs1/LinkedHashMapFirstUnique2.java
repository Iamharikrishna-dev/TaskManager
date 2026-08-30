package Two_hundred_programs1;

import java.util.*; public class LinkedHashMapFirstUnique2 { public static void main(String[] args) { String s="swiss";Map<Character,Integer> m=new LinkedHashMap<>();for(char c:s.toCharArray())m.put(c,m.getOrDefault(c,0)+1);for(char c:s.toCharArray())if(m.get(c)==1){System.out.println(c);break;} } }
