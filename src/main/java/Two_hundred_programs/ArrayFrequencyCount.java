package Two_hundred_programs;

public class ArrayFrequencyCount {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3};
        java.util.Map<Integer,Integer> freq = new java.util.TreeMap<>();
        for (int x : arr) freq.merge(x, 1, Integer::sum);
        System.out.println(freq);
    }
}