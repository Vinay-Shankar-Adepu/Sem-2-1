class Person{
    String PersonName; int PersonAge; String PersonGender; String PersonConsti;
    

    Person(){
        PersonConsti="Barkatpura";
        PersonCounterCheck++;
    }
    Person(int age){
        this.PersonAge=age;
        PersonConsti="Barkatpura";
    }
    Person(int age, String name){
        this.PersonAge=age;
        this.PersonName=name;
        PersonConsti="Barkatpura";
    }
    Person(int age, String name, String gender){
        this.PersonAge=age;
        this.PersonGender=gender;
        this.PersonName=name;
        PersonConsti="Barkatpura";
    }

    int CanVote(){
        if (this.PersonAge>=18){
            System.out.println(this.PersonName+" of age "+this.PersonAge+" and of constituency "+this.PersonConsti+" can vote.");
            return 1;
        }
        else{
            System.out.println(this.PersonName+" of age "+this.PersonAge+" and of constituency "+this.PersonConsti+" can not vote.");
            return 0;
        }
    }
}