import java.io.File;

public class deletedir {
    public static void main(String[] args) {
        File directory = new File("D:\\2-1\\Java Audi\\io\\ne");
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("not a directory.");
            return;
        }
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith(".txt")) {
                    System.out.println("File: " + file.getName() + " | Size: " + file.length() + " bytes");

                    if (file.delete()) {
                        System.out.println("Deleted: " + file.getName());
                    } else {
                        System.out.println("Failed to delete: " + file.getName());
                    }
                }
            }
        } else {
            System.out.println("The directory is empty or an error occurred while accessing it.");
        }
    }
}  