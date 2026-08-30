package Two_hundred_programs;

import java.io.*;
public class TryWithResourcesExample {
    public static void main(String[] args) {
        try (StringReader reader = new StringReader("Hello")) {
            int c;
            while ((c = reader.read()) != -1) System.out.print((char) c);
        } catch (IOException e) {
            System.out.println("IO error");
        }
    }
}