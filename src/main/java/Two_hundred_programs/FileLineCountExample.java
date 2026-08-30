package Two_hundred_programs;

import java.io.*;
public class FileLineCountExample {
    public static void main(String[] args) throws IOException {
        File file = new File("line_count_demo.txt");
        try (FileWriter fw = new FileWriter(file)) { fw.write("a\nb\nc\nd\n"); }
        int lines = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while (br.readLine() != null) lines++;
        }
        System.out.println("Line count: " + lines);
    }
}