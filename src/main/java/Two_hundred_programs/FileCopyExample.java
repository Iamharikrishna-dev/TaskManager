package Two_hundred_programs;

import java.io.*;
import java.nio.file.*;
public class FileCopyExample {
    public static void main(String[] args) throws IOException {
        Path source = Files.writeString(Path.of("source_demo.txt"), "Copy this content");
        Path target = Path.of("target_demo.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Copied to " + target.getFileName());
    }
}