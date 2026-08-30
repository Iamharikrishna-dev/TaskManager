package Two_hundred_programs;

import java.util.*;
public class RecursiveFibonacciMemo {
    static Map<Integer, Long> memo = new HashMap<>();
    static long fib(int n) {
        if (n <= 1) return n;
        if (memo.containsKey(n)) return memo.get(n);
        long result = fib(n - 1) + fib(n - 2);
        memo.put(n, result);
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Fib(30): " + fib(30));
    }
}