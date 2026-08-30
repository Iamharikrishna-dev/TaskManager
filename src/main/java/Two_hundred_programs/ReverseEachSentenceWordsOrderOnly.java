package Two_hundred_programs;

import java.util.*;
public class ReverseEachSentenceWordsOrderOnly {
    public static void main(String[] args) {
        String s = "one two three four five";
        List<String> words = new ArrayList<>(Arrays.asList(s.split(" ")));
        Collections.reverse(words);
        System.out.println(String.join(" ", words));
    }
}
