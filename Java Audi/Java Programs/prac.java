class Product{
    String name; String brand; Short stock; boolean inStock; float price;
    
    void PrintDetails(){
        System.out.println("Product Details: ");
        System.out.print(this.name+" "+this.brand+" "+this.price);
    }
    
    boolean inStock(){
        if (stock>0){
            return true;
        }
        else{
            return false;
        }
    }
    
    void restock(int value){
        Stock=value;
    }
    
    void sell(){
        if(inStock()){
            stock-=1;
        }
        else(restock(10)){
            stock-=1;
        }
    }
    
    void discount(float discount){
        price=price-(price*(discount/100));
    }
}