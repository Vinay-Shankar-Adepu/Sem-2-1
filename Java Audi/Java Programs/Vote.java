class Vote{
    public static void main(String[] args){
        Person p=new Person();
        Person p1=new Person(19);
        Person p2=new Person(18, "Adithya");
        Person p3=new Person(17, "Manideep", "male");
        p.CanVote();
        p1.CanVote();
        p2.CanVote();
        p3.CanVote();
        System.out.println("Number of people that can vote: "+ Person.PersonVoteCheck);
        System.out.println("Total number of partcipants: "+Person.PersonCounterCheck);
    }
}