package Two_hundred_programs;

public class AverageOfNArray {
    public static void main(String[] args) {
        int[] arr = {4, 8, 15, 16, 23, 42};
        double sum = 0;
        for (int x : arr) sum += x;
        System.out.println("Average: " + (sum / arr.length));
    }
}