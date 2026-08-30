package Two_hundred_programs1;

public class ThreadExample extends Thread { public void run(){System.out.println("Thread running");} public static void main(String[] args){new ThreadExample().start();} }
