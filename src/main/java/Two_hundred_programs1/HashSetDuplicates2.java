package Two_hundred_programs1;

import java.util.*; public class HashSetDuplicates2 { public static void main(String[] args) { int[] a={1,2,2,3,3}; Set<Integer> s=new HashSet<>();for(int x:a)if(!s.add(x))System.out.print(x+" "); } }
