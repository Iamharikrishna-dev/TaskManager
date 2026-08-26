package Two_hundred_programs;

public class ExceptionHandlingExample2 { public static void main(String[] args){try{int x=10/0;System.out.println(x);}catch(ArithmeticException e){System.out.println("Cannot divide by zero");}} }
