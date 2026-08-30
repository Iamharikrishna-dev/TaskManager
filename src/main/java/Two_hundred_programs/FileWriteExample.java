package Two_hundred_programs;

import java.io.*;
public class FileWriteExample {
    public static void main(String[] args) throws IOException {
        File file = new File("output_demo.txt");
        try (FileWriter fw = new FileWriter(file)) {
            fw.write("Hello, this is a file write demo.");
        }
        System.out.println("Written to " + file.getName());
    }
}