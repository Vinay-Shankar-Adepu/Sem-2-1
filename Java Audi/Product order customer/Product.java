// Product class
class Product {
    String name;
    double price;

    // Constructor
    Product(String n, double p){
        this.name=n;
        this.price=p;
    }   

    // Method to display product details
    void DisplayProductDetails(){
        System.out.println("Name: "+this.name+" Price: "+this.price);
    }
    
    // Method to get the price of the product
    double GetPrice(){
        return(this.price);
    }
}
