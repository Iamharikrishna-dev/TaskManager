package Two_hundred_programs;

final class ImmutablePoint2 {
    final int x, y;
    ImmutablePoint2(int x, int y) { this.x = x; this.y = y; }
}
public class FinalClassExample {
    public static void main(String[] args) {
        ImmutablePoint2 p = new ImmutablePoint2(5, 6);
        System.out.println(p.x + ", " + p.y);
    }
}