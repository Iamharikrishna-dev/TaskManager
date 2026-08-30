package Two_hundred_programs;

class Point3 implements Cloneable {
    int x, y;
    Point3(int x, int y) { this.x = x; this.y = y; }
    public Object clone() throws CloneNotSupportedException { return super.clone(); }
}
public class ObjectCloningExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point3 p1 = new Point3(1, 2);
        Point3 p2 = (Point3) p1.clone();
        System.out.println(p2.x + ", " + p2.y);
    }
}