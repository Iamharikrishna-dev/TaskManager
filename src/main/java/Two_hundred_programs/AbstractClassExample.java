package Two_hundred_programs;

abstract class ShapeX { abstract void draw(); } public class AbstractClassExample extends ShapeX { void draw(){System.out.println("Drawing");} public static void main(String[] args){new AbstractClassExample().draw();} }
