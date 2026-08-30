package Two_hundred_programs;

import java.io.*;
public class FileReadExample {
    public static void main(String[] args) throws IOException {
        File file = new File("output_demo.txt");
        if (!file.exists()) { try (FileWriter fw = new FileWriter(file)) { fw.write("Sample content"); } }
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) System.out.println(line);
        }
    }
}