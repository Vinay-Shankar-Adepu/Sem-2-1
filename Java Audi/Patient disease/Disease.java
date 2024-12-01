// Disease class
class Disease {
    String name;
    String stage;

    // Constructor
    Disease(String n, String s){
        this.name=n;
        this.stage=s;
    }

    // Method to display disease details
    String DisplayDisease(){
        return(this.name+" "+this.stage);
    }
}
