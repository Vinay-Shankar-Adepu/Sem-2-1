/* In a retail store, 3 products are there, one can print details of the products, 
sell it or give discounts on the products, products can be restocked if the inventory 
reaches 0, one can also check for the inventory of the product.

1 product-12
2 product-5
3 product-7

1 customer-2,3(4)
2 customer-1,2,3(4)
3 customer-1(10)
4 customer-1(5)

details sell discount restock checkstock*/
class Products{
    String ProductName;float ProductPrice;short Stash;float DiscountOfProduct;

    void ProductsDetails(){
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println(this.ProductName+" | "+this.ProductPrice+" | "+this.Stash);
    }

    float TotalPrice(float p, float d){
        p=p-p*(d/100);
        return p;
    }

    void SellProduct(){
        if (Stash>0){
            System.out.println("Purchased product "+this.ProductName+" for "+TotalPrice(this.ProductPrice, this.DiscountOfProduct));
            Stash--;
        }
        else{
            RestockProducts();
            SellProduct();
        }
    }

    void RestockProducts(){
        Stash+=10;
        System.out.println("**Product "+this.ProductName+" has been restocked successfully.**");
    }

    void CheckStash(){
        System.out.println("Stock left: "+this.Stash);
    }
}