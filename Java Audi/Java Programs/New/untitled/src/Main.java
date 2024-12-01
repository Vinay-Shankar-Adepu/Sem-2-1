import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
//import java.io.FileWriter;
import java.io.IOException;
//import java.util.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("D:\\2-1\\Java Audi\\Java Programs\\New\\untitled\\src\\names.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 3 && parts[2].equalsIgnoreCase("female")) {
                    System.out.println(parts[1] + " is " + parts[0] + " years old");
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}