//package io_streams;

import java.io.*;

public class main1 {
    public static void main(String[] args) throws IOException{
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("Data12341546.dat"))) {
            dos.writeInt(123);
            dos.writeDouble(456.78);
            dos.writeUTF("Data Stream Example");
            System.out.println("Finished Writing");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (DataInputStream dis = new DataInputStream(new FileInputStream("Data12341546.dat"))) {
            int intValue = dis.readInt();
            double doubleValue = dis.readDouble();
            String utfValue = dis.readUTF();

            System.out.println("Read Values:");
            System.out.println("Integer: " + intValue);
            System.out.println("Double: " + doubleValue);
            System.out.println("String: " + utfValue);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}