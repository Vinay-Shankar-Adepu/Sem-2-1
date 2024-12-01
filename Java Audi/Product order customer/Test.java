// Main class to test the relationship
public class Test {
    public static void main(String[] args) {
        // Create Product objects
        Product product1 = new Product("Laptop", 1200.00);
        Product product2 = new Product("Phone", 800.00);
        Product product3 = new Product("Headphones", 150.00);

        // Create an Order object
        Order order1 = new Order(101);
        order1.addProduct(product1,0);
        order1.addProduct(product2,1);

        Order order2 = new Order(102);
        order2.addProduct(product3,0);

        // Create a Customer object
        Customer customer = new Customer("John Doe");

        // Add orders to the customer
        customer.addOrder(order1,0);
        customer.addOrder(order2,1);

        // Display customer details along with their orders and total cost
        customer.displayCustomerInfo();
    }
}