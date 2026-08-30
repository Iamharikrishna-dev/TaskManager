package Two_hundred_programs;

class Point2 {
    int x, y;
    Point2(int x, int y) { this.x = x; this.y = y; }
    void show() { System.out.println(x + ", " + y); }
}
public class ThisKeywordExample {
    public static void main(String[] args) {
        new Point2(3, 4).show();
    }
}