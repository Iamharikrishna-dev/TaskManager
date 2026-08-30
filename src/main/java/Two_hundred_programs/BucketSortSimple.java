package Two_hundred_programs;

import java.util.*;
public class BucketSortSimple {
    public static void main(String[] args) {
        double[] arr = {0.42, 0.32, 0.23, 0.52, 0.25, 0.47};
        List<List<Double>> buckets = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) buckets.add(new ArrayList<>());
        for (double x : arr) buckets.get((int) (x * arr.length)).add(x);
        for (List<Double> b : buckets) Collections.sort(b);
        int idx = 0;
        for (List<Double> b : buckets) for (double x : b) arr[idx++] = x;
        System.out.println(Arrays.toString(arr));
    }
}