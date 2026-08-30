package Two_hundred_programs;

import java.util.*;
public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1); deque.addLast(2); deque.addFirst(0);
        System.out.println(deque);
    }
}