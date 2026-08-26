package Two_hundred_programs;

import java.util.*; public class HashMapFrequency { public static void main(String[] args) { String s="banana"; Map<Character,Integer> m=new HashMap<>();for(char c:s.toCharArray())m.put(c,m.getOrDefault(c,0)+1);System.out.println(m); } }
