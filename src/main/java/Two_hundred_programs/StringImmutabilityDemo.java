package Two_hundred_programs;

public class StringImmutabilityDemo {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = s1.concat(" world");
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s1 unchanged after concat, proving immutability");
    }
}
