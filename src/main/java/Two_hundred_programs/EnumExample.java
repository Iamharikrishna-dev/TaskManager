package Two_hundred_programs;

enum Day2 { MON, TUE, WED, THU, FRI, SAT, SUN }
public class EnumExample {
    public static void main(String[] args) {
        for (Day2 d : Day2.values()) System.out.println(d);
    }
}