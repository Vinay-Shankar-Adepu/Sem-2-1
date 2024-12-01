// Student class (Has-A relationship with Address)
class Student {
    private String name;
    private int rollNumber;
    private Address address; // Student has an Address

    // Constructor
    public Student(String name, int rollNumber, Address address) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.address = address;
    }

    // Method to display student details
    public void displayStudentInfo() {
        System.out.println("Name: " + name + ", Roll Number: " + rollNumber);
        address.displayAddress(); // Student uses the Address object
    }
}
