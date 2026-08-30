package Two_hundred_programs;

public class StringRotationCheck {
    public static void main(String[] args) {
        String s1 = "waterbottle", s2 = "erbottlewat";
        System.out.println((s1.length() == s2.length() && (s1 + s1).contains(s2)) ? "Rotation" : "Not Rotation");
    }
}