package Two_hundred_programs;

public class ArrayMerge {
    public static void main(String[] args) {
        int[] a = {1, 3, 5}, b = {2, 4, 6};
        int[] merged = new int[a.length + b.length];
        System.arraycopy(a, 0, merged, 0, a.length);
        System.arraycopy(b, 0, merged, a.length, b.length);
        System.out.println(java.util.Arrays.toString(merged));
    }
}