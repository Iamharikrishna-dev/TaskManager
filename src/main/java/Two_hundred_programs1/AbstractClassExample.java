package Two_hundred_programs1;

abstract class ShapeX { abstract void draw(); } public class AbstractClassExample extends ShapeX { void draw(){System.out.println("Drawing");} public static void main(String[] args){new AbstractClassExample().draw();} }
