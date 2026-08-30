package Two_hundred_programs;

import java.util.stream.*;
public class ReverseStringUsingStream {
    public static void main(String[] args) {
        String s = "stream reversal demo";
        String reversed = IntStream.range(0, s.length())
                .mapToObj(i -> s.charAt(s.length() - 1 - i))
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(reversed);
    }
}
