package Two_hundred_programs1;

public class ToggleCase {
    public static void main(String[] args) {
        String s="Java Programming";
        StringBuilder r=new StringBuilder();
        for(char c:s.toCharArray())
            r.append(Character.isUpperCase(c)?Character.toLowerCase(c):Character.toUpperCase(c));
        System.out.println(r);
    }
}
