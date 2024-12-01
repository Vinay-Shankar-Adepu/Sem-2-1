// Order class (Has-A relationship with Product)


class Order {
    //orderId, products;
    int orderId;
    Product products[];
    // Constructor
    Order(int i){
        this.orderId=i;
        products=new Product[10];
    }

    // Method to add a product to the order
    void addProduct(Product p, int index){
        this.products[index]=p;
        index++;
    }
    // Method to display order details
    void DisplayOrderDetails(){
        System.out.println("Order ID:"+this.orderId);
        for (int i=0; i<products.length; i++){
            if (products[i]!=null){
                products[i].DisplayProductDetails();   
            }
        }
    }
    // Method to calculate total cost of the order
    double Totalcost(){
        double s=0;
        for (int i=0; i<products.length; i++){
            if (products[i]!=null){
                s=s+products[i].price;   
            }
        }
        return(s);
    }
}
