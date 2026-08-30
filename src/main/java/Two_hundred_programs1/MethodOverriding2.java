package Two_hundred_programs1;

class ParentX {
    void show() {
        System.out.println("Parent");
    }
}

public class MethodOverriding2 extends ParentX {

    void show() {
        System.out.println("Child");
    }

    public static void main(String[] args) {
        new MethodOverriding2().show();
    }
}