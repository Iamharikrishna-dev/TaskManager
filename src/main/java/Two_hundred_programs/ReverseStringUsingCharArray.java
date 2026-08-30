package Two_hundred_programs;

public class ReverseStringUsingCharArray {
    public static void main(String[] args) {
        String s = "manual reversal";
        char[] chars = s.toCharArray();
        char[] reversed = new char[chars.length];
        for (int i = 0; i < chars.length; i++) reversed[i] = chars[chars.length - 1 - i];
        System.out.println(new String(reversed));
    }
}
