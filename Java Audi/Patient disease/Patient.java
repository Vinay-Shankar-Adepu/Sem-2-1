// Patient class (Has-A relationship with Disease);

class Patient {
    String name;
    int age;
    Disease []disease; // Patient has diseases

    // Constructor
    Patient(String n, int a){
        this.name=n;
        this.age=a;
        disease=new Disease[5];
    }
    
    // Method to add a disease to the patient
    void Diagnose(Disease d, int index){
        this.disease[index]=d;
    }
    void Diagnose(String na, String st, int index){
        Disease d=new Disease(na, st);
        this.disease[index]=d;
    }
    
    // Method to display patient details along with their diseases
    void displayPatientInfo(){
        System.out.println("Patient: "+this.name+" Age: "+this.age);
        for (int i=0; i<disease.length;i++){
            if (disease[i]!=null)
                System.out.println(disease[i].DisplayDisease());
        }
    }
   
}

