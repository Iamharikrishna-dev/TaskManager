package Two_hundred_programs1;

class ParentX1 {
    void show() {
        System.out.println("Parent");
    }
}

public class MethodOverriding extends ParentX1 {
    void show() {
        System.out.println("Child");
    }

    public static void main(String[] args) {
        new MethodOverriding().show();
    }
}