package Two_hundred_programs;

import java.util.*;
public class ReverseStringUsingStack {
    public static void main(String[] args) {
        String s = "stack based reverse";
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) stack.push(c);
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) sb.append(stack.pop());
        System.out.println(sb);
    }
}
