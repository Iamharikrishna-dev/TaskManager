package Two_hundred_programs;

public class StringBuilderCapacityExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println("Initial capacity: " + sb.capacity());
        sb.append("This is a fairly long string to force growth");
        System.out.println("Length: " + sb.length());
        System.out.println("New capacity: " + sb.capacity());
    }
}
