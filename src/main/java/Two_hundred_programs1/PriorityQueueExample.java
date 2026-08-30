package Two_hundred_programs1;

import java.util.*; public class PriorityQueueExample { public static void main(String[] args) { Queue<Integer> q=new PriorityQueue<>(Arrays.asList(5,1,3,2));while(!q.isEmpty())System.out.print(q.poll()+" "); } }
