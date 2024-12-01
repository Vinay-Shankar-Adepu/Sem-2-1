// Main class to test the relationship
public class Test {
    public static void main(String[] args) {
        // Create an Address object
        Address a1=new Address("Street1","city1","state1");
        Address a2=new Address("Street2","city2","state2");
        Address a3=new Address("Street3","city3","state3");

        // Create a Student object and pass the Address
        Student s1=new Student ("student1",501,a1);
        Student s2=new Student ("student2",502,a2);
        Student s3=new Student ("student3",503,a3);
        // Display student information along with address
        s1.displayStudentInfo();
        s2.displayStudentInfo();
        s3.displayStudentInfo();
       
    }
}
