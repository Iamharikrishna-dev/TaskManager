package Two_hundred_programs;

import java.io.*;
public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        String data = "line1\nline2\nline3";
        try (BufferedReader br = new BufferedReader(new StringReader(data))) {
            String line;
            while ((line = br.readLine()) != null) System.out.println("Read: " + line);
        }
    }
}