package Two_hundred_programs;

public class ReverseWordOrderInSentence {
    public static void main(String[] args) {
        String sentence = "Java is a powerful language";
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) sb.append(" ");
        }
        System.out.println(sb);
    }
}
