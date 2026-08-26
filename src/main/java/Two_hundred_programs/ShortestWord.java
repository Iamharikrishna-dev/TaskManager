package Two_hundred_programs;

public class ShortestWord {
    public static void main(String[] args) {
        String[] a="Java programming is interesting".split("\\s+"), best=a[0];
        for(String s:a) if(s.length()<best.length()) best=s;
        System.out.println(best);
    }
}
