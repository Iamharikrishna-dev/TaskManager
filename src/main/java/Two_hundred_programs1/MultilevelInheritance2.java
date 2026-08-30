

class A1 { void a(){System.out.println("A");} } class B1 extends A1 { void b(){System.out.println("B");} } public class MultilevelInheritance2 extends B1 { public static void main(String[] args){MultilevelInheritance2 x=new MultilevelInheritance2();x.a();x.b();} }
