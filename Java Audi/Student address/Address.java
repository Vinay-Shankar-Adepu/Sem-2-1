// Address class
class Address {
    private String street;
    private String city;
    private String state;

    // Constructor
    public Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }

    // Method to display address details
    public void displayAddress() {
        System.out.println("Address: " + street + ", " + city + ", " + state);
    }
}
