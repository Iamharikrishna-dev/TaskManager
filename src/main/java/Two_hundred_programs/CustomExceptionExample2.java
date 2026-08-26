package Two_hundred_programs;

class AgeExceptionX extends Exception { AgeExceptionX(String m){super(m);} } public class CustomExceptionExample2 { public static void main(String[] args){try{int age=15;if(age<18)throw new AgeExceptionX("Not eligible");}catch(Exception e){System.out.println(e.getMessage());}} }
