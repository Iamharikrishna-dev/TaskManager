package Two_hundred_programs;

public class StringBufferEqualsVsContentEquals {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("data");
        StringBuffer sb2 = new StringBuffer("data");
        System.out.println("sb1.equals(sb2): " + sb1.equals(sb2));
        System.out.println("sb1 content equals sb2: " + sb1.toString().equals(sb2.toString()));
    }
}
