package Two_hundred_programs1;

public class ExceptionHandlingExample { public static void main(String[] args){try{int x=10/0;System.out.println(x);}catch(ArithmeticException e){System.out.println("Cannot divide by zero");}} }
