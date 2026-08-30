package Two_hundred_programs;

import java.util.Scanner;
public class ScannerUserInputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program reads a line via Scanner from standard input.");
        if (sc.hasNextLine()) {
            String input = sc.nextLine();
            System.out.println("You entered: " + input);
        } else {
            System.out.println("No input provided.");
        }
    }
}