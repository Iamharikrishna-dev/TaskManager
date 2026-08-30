package Two_hundred_programs;

public class StringBufferCapacityExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(50);
        System.out.println("Capacity: " + sb.capacity());
        sb.append("Small string");
        System.out.println("Length: " + sb.length() + ", Capacity still: " + sb.capacity());
    }
}
