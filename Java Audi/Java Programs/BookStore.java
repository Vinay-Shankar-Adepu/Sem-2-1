class BookStore{
    public static void main(String[] args){
        Person k=new Person(18,"Adithya","Male");
        Book b1=new Book();
        b1.name="451 Farenheit";b1.year=1966;b1.price=450.00f;b1.noOfCopies=3;b1.author="Ray Bradbury";b1.discount=30;
        Book b2=new Book();
        b2.name="LOTM";b2.year=2020;b2.price=350.00f;b2.noOfCopies=4;b2.author="CuttleFish";b2.discount=20;
        Book b3=new Book();
        b3.name="Wind Calamity";b3.year=2021;b3.price=550.00f;b3.noOfCopies=5;b3.author="DevilHex";b3.discount=10;

        b1.ShowDetails();
        b2.ShowDetails();
        b3.ShowDetails();
        System.out.println();
        float a=0;
        //------------------------------------------------------------------
        System.out.println("Customer 1:");
        boolean s=b1.sell(k);
        if (s==true){
            a=a+b1.EndPrice(b1.price, b1.discount);
        }
        //
        s=b2.sell(k);
        if (s==true){
            a=a+b2.EndPrice(b2.price, b2.discount);
        }
        //
        s=b2.sell(k);
        if (s==true){
            a=a+b2.EndPrice(b2.price, b2.discount);
        }
        //-------------------------------------------------------------------
        System.out.println("Customer 2");
        s=b1.sell(k);
        if (s==true){
            a=a+b1.EndPrice(b1.price, b1.discount);
        }
        //
        s=b1.sell(k);
        if (s==true){
            a=a+b1.EndPrice(b1.price, b1.discount);
        }
        //
        s=b3.sell(k);
        if (s==true){
            a=a+b3.EndPrice(b3.price, b3.discount);
        }
        //-------------------------------------------------------------------
        System.out.println("Customer 3:");
        s=b2.sell(k);
        if (s==true){
            a=a+b2.EndPrice(b2.price, b2.discount);
        }
        //
        s=b2.sell(k);
        if (s==true){
            a=a+b2.EndPrice(b2.price, b2.discount);
        }
        //--------------------------------------------------------------------
        System.out.println("The total money earned: "+a);
    }
}