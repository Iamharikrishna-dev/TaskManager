package Two_hundred_programs;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4}, b = {3, 4, 5, 6};
        java.util.Set<Integer> setA = new java.util.HashSet<>();
        for (int x : a) setA.add(x);
        for (int x : b) if (setA.contains(x)) System.out.print(x + " ");
    }
}