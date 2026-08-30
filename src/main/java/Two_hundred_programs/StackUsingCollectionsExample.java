package Two_hundred_programs;

import java.util.*;
public class StackUsingCollectionsExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("first"); stack.push("second"); stack.push("third");
        while (!stack.isEmpty()) System.out.println(stack.pop());
    }
}