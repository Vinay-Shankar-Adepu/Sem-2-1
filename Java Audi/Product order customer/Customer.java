// Customer class (Has-A relationship with Order)
class Customer {

    //name, orders;
     String name; Order orders[];
     // Constructor
     Customer(String n){
         this.name=n;
         orders=new Order[10];
     }
 
     // Method to add an order to the customer
     void addOrder(Order i, int ind){
         this.orders[ind]=i;
         ind++;
     }
      
     // Method to display customer details along with their orders
     void displayCustomerInfo(){
         for (int i=0; i<orders.length; i++){
             if (orders[i]!=null){
                 System.out.println("Customer name: "+this.name);
                 orders[i].DisplayOrderDetails();
             }
         }
     }
 
 }
 