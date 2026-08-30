package Two_hundred_programs;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMIV";
        java.util.Map<Character,Integer> m = java.util.Map.of('I',1,'V',5,'X',10,'L',50,'C',100,'D',500,'M',1000);
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int val = m.get(s.charAt(i));
            if (i + 1 < s.length() && val < m.get(s.charAt(i + 1))) total -= val; else total += val;
        }
        System.out.println(total);
    }
}