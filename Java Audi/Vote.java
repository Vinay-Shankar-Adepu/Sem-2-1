class Vote{
    public static void main(String[] args){
        Person p=new Person();
        Person p1=new Person(19);
        Person p2=new Person(18, "Adithya");
        Person p3=new Person(17, "Anish", "male");
        int x=p.CanVote();
        int x1=p1.CanVote();
        int x2=p2.CanVote();
        int x3=p3.CanVote();
        int y=x+x1+x2+x3;
        System.out.println("Number of people that can vote: "+ y);
    }
}