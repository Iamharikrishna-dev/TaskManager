import java.util.Arrays;
import java.util.List;

public class Streamstring {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Python", "C++", "JavaScript");
        list.stream().filter(s->s.contains("Java")).forEach(System.out::println);

    }
}
