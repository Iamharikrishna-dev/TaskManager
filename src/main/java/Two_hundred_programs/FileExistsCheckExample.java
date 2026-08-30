package Two_hundred_programs;

import java.io.*;
public class FileExistsCheckExample {
    public static void main(String[] args) {
        File file = new File("some_random_file.txt");
        System.out.println(file.exists() ? "File exists" : "File does not exist");
    }
}