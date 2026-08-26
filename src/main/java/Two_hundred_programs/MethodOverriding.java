package Two_hundred_programs;

class ParentX { void show(){System.out.println("Parent");} } public class MethodOverriding extends ParentX { void show(){System.out.println("Child");} public static void main(String[] args){new MethodOverriding().show();} }
