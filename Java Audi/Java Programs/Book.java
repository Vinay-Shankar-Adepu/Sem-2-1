class Book{
    String name; int year; float price; short noOfCopies; String author; float discount;

    boolean sell(Person p){
        if (noOfCopies>0 && p.PersonAge>=18){
            System.out.println(p.PersonName+" buyed a copy of "+this.name+" written by "+this.author+" for the price of "+EndPrice(this.price, this.discount));
            return(true);
        }
        else{
            System.out.println("The book is out of stock or underage.");
            return(false);
        }
    }
    float EndPrice(float p, float d){
        p=p-p*(d/100);
        return(p);
    }
    void ShowDetails(){
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println(this.name+" || "+this.author+" || "+EndPrice(this.price, this.discount)+" || "+this.year+" || "+this.noOfCopies);
    }
}