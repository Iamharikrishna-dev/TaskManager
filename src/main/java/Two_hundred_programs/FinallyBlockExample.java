package Two_hundred_programs;

public class FinallyBlockExample {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 2);
        } finally {
            System.out.println("Finally block always runs");
        }
    }
}