package Two_hundred_programs;

import java.io.*;
public class FileDeleteExample {
    public static void main(String[] args) throws IOException {
        File file = new File("temp_delete_demo.txt");
        file.createNewFile();
        if (file.delete()) System.out.println("Deleted: " + file.getName());
        else System.out.println("Delete failed");
    }
}