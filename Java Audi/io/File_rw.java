// import java.io.*;
// import java.util.Scanner;

// public class File_rw {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String fileName = "D:\\2-1\\Java Audi\\io\\Vinay.txt";


//         try {
//             // Take input from the user
//             System.out.print("Enter your name: ");
//             String name = scanner.nextLine();

//             System.out.print("Enter your age: ");
//             int age = scanner.nextInt();
//             scanner.nextLine(); // Consume the leftover newline

//             System.out.print("Enter your hobby: ");
//             String hobby = scanner.nextLine();

//             // Write the input to the file
//             FileWriter writer = new FileWriter(fileName);
//             writer.write("Name: " + name + "\n");
//             writer.write("Age: " + age + "\n");
//             writer.write("Hobby: " + hobby + "\n");
//             writer.close();
//             System.out.println("Information saved to " + fileName);`

//             // Read the file to verify the content
//             FileReader reader = new FileReader(fileName);
//             BufferedReader bufferedReader = new BufferedReader(reader);
//             String line;
//             System.out.println("\nContent of " + fileName + ":");
//             while ((line = bufferedReader.readLine()) != null) {
//                 System.out.println(line);
//             }
//             reader.close();
//         } catch (IOException e) {
//             System.out.println("An error occurred while handling the file: " + e.getMessage());
//         } catch (Exception e) {
//             System.out.println("An unexpected error occurred: " + e.getMessage());
//         }

//         scanner.close();
//     }
// }
// import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.util.Scanner;

// public class File_rw {
//     public static void main(String[] args) {
//         File f = new File("collections.csv");

//         try {
//             if (!f.canWrite() && f.exists()) {
//                 System.out.println("The file is currently in use by another process. Please close it and try again.");
//                 return;
//             }

//             f.setWritable(true);
//             FileWriter fw = new FileWriter(f);
//             fw.write("Name,Age,Sex\n");

//             Scanner sc = new Scanner(System.in);
//             int count = 0;
//             while (count < 3) {
//                 System.out.println("Enter details:");
//                 System.out.print("Name: ");
//                 fw.write(sc.nextLine() + ",");
//                 System.out.print("Age: ");
//                 fw.write(sc.nextInt() + ",");
//                 sc.nextLine();
//                 System.out.print("Sex: ");
//                 fw.write(sc.nextLine() + "\n");
//                 count++;
//             }

//             fw.close();
//             sc.close();

//             f.setReadable(true);
//             f.setWritable(false);

//             System.out.println("Data has been successfully written to collections.csv.");
//         } catch (IOException e) {
//             System.out.println("An error occurred while accessing the file: " + e.getMessage());
//         }
//     }
// }

import java.io.*;
import java.util.Scanner;

public class File_rw{
    public static void main(String[] args) throws IOException {
        File f = new File("collections.csv");
        f.setWritable(true);
        FileWriter fw = new FileWriter(f, true);
        if (f.length() == 0) {
            fw.write("Name,Age,Sex\n");
        }
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (count < 2) {
            System.out.println("Enter details:");
            System.out.print("Name: ");
            fw.append(sc.nextLine() + ",");
            System.out.print("Age: ");
            fw.append(sc.nextInt() + ",");
            sc.nextLine();
            System.out.print("Sex: ");
            fw.append(sc.nextLine() + "\n");
            count++;
        }
        fw.close();
        sc.close();
        f.setReadable(true);
        f.setWritable(false);
        System.out.println("Data has been successfully written to collections.csv.");
    }
}
