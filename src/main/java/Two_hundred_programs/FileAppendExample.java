package Two_hundred_programs;

import java.io.*;
public class FileAppendExample {
    public static void main(String[] args) throws IOException {
        File file = new File("append_demo.txt");
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("Appended line\n");
        }
        System.out.println("Appended to " + file.getName());
    }
}