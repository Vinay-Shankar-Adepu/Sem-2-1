class RetailStore{
    public static void main(String[] args){
        Products p1=new Products();
        p1.ProductName="Milk"; p1.ProductPrice=33.00f; p1.Stash=12; p1.DiscountOfProduct=10.00f;
        Products p2=new Products();
        p2.ProductName="Chips"; p2.ProductPrice=10.00f; p2.Stash=5; p2.DiscountOfProduct=5.00f;
        Products p3=new Products();
        p3.ProductName="Chocolate"; p3.ProductPrice=40.00f; p3.Stash=12; p3.DiscountOfProduct=2.00f;

        System.out.println("Customer 1:");
        p1.ProductsDetails();
        p2.ProductsDetails();
        p3.ProductsDetails();
        System.out.println("-----------------------------------------------------------------------------------");
        p2.SellProduct();
        p3.SellProduct();
        p3.SellProduct();
        p3.SellProduct();
        p3.SellProduct();

        System.out.println("Customer 2:");
        p1.ProductsDetails();
        p2.ProductsDetails();
        p3.ProductsDetails();
        System.out.println("-----------------------------------------------------------------------------------");
        p1.SellProduct();
        p2.SellProduct();
        p3.SellProduct();
        p3.SellProduct();
        p3.SellProduct();
        p3.SellProduct();

        System.out.println("Customer 3:");
        p1.ProductsDetails();
        p2.ProductsDetails();
        p3.ProductsDetails();
        System.out.println("-----------------------------------------------------------------------------------");
        p1.SellProduct();
        p1.SellProduct();
        p1.SellProduct();
        p1.SellProduct();
        p1.SellProduct();
        p1.SellProduct();
        p1.SellProduct();
        p1.SellProduct();
        p1.SellProduct();
        p1.SellProduct();

        System.out.println("Customer 4:");
        p1.ProductsDetails();
        p2.ProductsDetails();
        p3.ProductsDetails();
        System.out.println("-----------------------------------------------------------------------------------");
        p1.SellProduct();
        p1.SellProduct();
        p1.SellProduct();
        p1.SellProduct();
        p1.SellProduct();
    }
}