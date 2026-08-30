package Two_hundred_programs;

import java.util.stream.*;
public class StreamStringToCharStream {
    public static void main(String[] args) {
        String s = "hello";
        long vowelCount = s.chars().mapToObj(c -> (char) c).filter(c -> "aeiou".indexOf(c) >= 0).count();
        System.out.println("Vowel count: " + vowelCount);
    }
}
