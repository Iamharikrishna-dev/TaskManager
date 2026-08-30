

interface PrintableX { void print(); } public class InterfaceExample2 implements PrintableX { public void print(){System.out.println("Hello");} public static void main(String[] args){new InterfaceExample2().print();} }
