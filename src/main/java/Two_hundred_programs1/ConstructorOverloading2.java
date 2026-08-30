package Two_hundred_programs1;

public class ConstructorOverloading2 {

    ConstructorOverloading2() {
        System.out.println("Default");
    }

    ConstructorOverloading2(int x) {
        System.out.println(x);
    }

    public static void main(String[] args) {
        new ConstructorOverloading2();
        new ConstructorOverloading2(10);
    }
}