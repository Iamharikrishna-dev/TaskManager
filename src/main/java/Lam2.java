import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public final class Lam2 {

    public static void main(String[] args) {
        demo1();
        demo2();
    }
    private static void demo1() {
        System.out.println(" Runnable ");
        Runnable before = new Runnable() {@Override public void run() { System.out.println("Running task 1");}};
        before.run();
        Runnable after = () -> System.out.println("Running task 2");
        after.run();
    }
    private static void demo2() {
        List<String> list = List.of("apple", "banana", "cherry");
        System.out.println(" Comparator ");
        Comparator<String> before = new Comparator<String>() {@Override public int compare(String a, String b) { return a.compareToIgnoreCase(b);}};
        List<String> iterator = new ArrayList<>(list);
        iterator.sort(before);
        System.out.println(iterator);

        Comparator<String> after = (a, b) -> a.compareToIgnoreCase(b);
        List<String> iterator2 = new ArrayList<>(list);
        iterator2.sort(after);
        System.out.println(iterator2);

        ListIterator<String> iterator3 = list.listIterator();
//        iterator3.sort(String::compareToIgnoreCase);

    }

}
