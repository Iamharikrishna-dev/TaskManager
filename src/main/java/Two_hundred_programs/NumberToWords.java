package Two_hundred_programs;

public class NumberToWords {
    public static void main(String[] args) {
        String[] words = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        int n = 4092;
        StringBuilder sb = new StringBuilder();
        for (char c : String.valueOf(n).toCharArray()) sb.append(words[c - '0']).append(" ");
        System.out.println(sb.toString().trim());
    }
}