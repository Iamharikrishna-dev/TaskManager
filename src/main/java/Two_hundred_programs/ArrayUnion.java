package Two_hundred_programs;

public class ArrayUnion {
    public static void main(String[] args) {
        int[] a = {1, 2, 3}, b = {3, 4, 5};
        java.util.Set<Integer> set = new java.util.LinkedHashSet<>();
        for (int x : a) set.add(x);
        for (int x : b) set.add(x);
        System.out.println(set);
    }
}