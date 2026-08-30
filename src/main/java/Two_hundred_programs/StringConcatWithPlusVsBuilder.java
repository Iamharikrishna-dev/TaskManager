package Two_hundred_programs;

public class StringConcatWithPlusVsBuilder {
    public static void main(String[] args) {
        long start = System.nanoTime();
        String s = "";
        for (int i = 0; i < 1000; i++) s += i;
        long plusTime = System.nanoTime() - start;

        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) sb.append(i);
        long builderTime = System.nanoTime() - start;

        System.out.println("String + took: " + plusTime + " ns");
        System.out.println("StringBuilder took: " + builderTime + " ns");
    }
}
