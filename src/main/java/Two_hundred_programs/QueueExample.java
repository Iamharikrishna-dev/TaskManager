package Two_hundred_programs;

import java.util.*;
public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1); queue.offer(2); queue.offer(3);
        while (!queue.isEmpty()) System.out.println(queue.poll());
    }
}