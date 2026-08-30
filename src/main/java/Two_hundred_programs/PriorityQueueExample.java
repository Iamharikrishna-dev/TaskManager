package Two_hundred_programs;

import java.util.*;
public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Arrays.asList(5, 1, 4, 2, 3));
        while (!pq.isEmpty()) System.out.print(pq.poll() + " ");
    }
}