package Two_hundred_programs;

public class ThreadExample2 extends Thread { public void run(){System.out.println("Thread running");} public static void main(String[] args){new ThreadExample2().start();} }
