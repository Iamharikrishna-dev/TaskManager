package Two_hundred_programs;

public class NestedTryCatchExample {
    public static void main(String[] args) {
        try {
            try {
                int[] arr = {1, 2};
                System.out.println(arr[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: " + e.getMessage());
                throw new RuntimeException("Rethrown");
            }
        } catch (RuntimeException e) {
            System.out.println("Outer catch: " + e.getMessage());
        }
    }
}