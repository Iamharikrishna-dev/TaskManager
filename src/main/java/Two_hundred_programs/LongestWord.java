package Two_hundred_programs;

public class LongestWord {
    public static void main(String[] args) {
        String[] a="Java programming is interesting".split("\\s+"), best="";
        for(String s:a) if(s.length()>best.length()) best=s;
        System.out.println(best);
    }
}
