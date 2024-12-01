import java.io.*;
class Emp implements Serializable{
    String name;
    int age;
    Emp(String name,int age){
        this.name=name;
        this.age=age;

    }
}
class serial{
    public static void main(String[] args) throws IOException{
        Emp e1=new Emp("vinay", 18);
        FileOutputStream fos=new FileOutputStream("hello.txt");
        ObjectOutputStream oos =new ObjectOutputStream(fos);
        oos.writeObject(e1);
        System.out.println("object got serialized");
    }
}