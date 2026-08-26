package Two_hundred_programs;

interface PrintableX { void print(); } public class InterfaceExample implements PrintableX { public void print(){System.out.println("Hello");} public static void main(String[] args){new InterfaceExample().print();} }
