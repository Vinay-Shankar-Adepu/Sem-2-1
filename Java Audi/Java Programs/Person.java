class Person{
    String PersonName; int PersonAge; String PersonGender; String PersonConsti;
    static int PersonVoteCheck=0;//Static variable(accessable for all objects, belongs to class and isnt created each time an object is created.)
    static int PersonCounterCheck=0;//Static variable.  
    Person(){
        PersonConsti="Barkatpura";
        PersonCounterCheck++;
    }
    Person(int age){              //default constructor
        this.PersonAge=age;
        PersonConsti="Barkatpura";
        PersonCounterCheck++;
    }
    Person(int age, String name){
        this.PersonAge=age;
        this.PersonName=name;
        PersonConsti="Barkatpura";
        PersonCounterCheck++;
    }
    Person(int age, String name, String gender){
        this.PersonAge=age;
        this.PersonGender=gender;
        this.PersonName=name;
        PersonConsti="Barkatpura";
        PersonCounterCheck++;
    }

    void CanVote(){
        if (this.PersonAge>=18){
            System.out.println(this.PersonName+" of age "+this.PersonAge+" and of constituency "+this.PersonConsti+" can vote.");
            PersonVoteCheck++;
        }
        else{
            System.out.println(this.PersonName+" of age "+this.PersonAge+" and of constituency "+this.PersonConsti+" can not vote.");
        }
    }
}