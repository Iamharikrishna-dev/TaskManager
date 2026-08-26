package Two_hundred_programs;

class A1 { void a(){System.out.println("A");} } class B1 extends A1 { void b(){System.out.println("B");} } public class MultilevelInheritance extends B1 { public static void main(String[] args){MultilevelInheritance x=new MultilevelInheritance();x.a();x.b();} }
