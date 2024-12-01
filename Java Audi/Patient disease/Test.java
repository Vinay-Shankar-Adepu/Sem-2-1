 // Main class to test the relationship
 public class Test {
    public static void main(String[] args) {
        // Create Disease objects
        Disease flu = new Disease("Flu", "3");
        Disease diabetes = new Disease("Diabetes", "2");
        Disease Tuberculosis = new Disease("Tuberculosis", "5");

        // Create a Patient object
        Patient p = new Patient("Alice Johnson", 45);
        p.Diagnose(flu,0);
        p.Diagnose(diabetes,1);
        p.Diagnose(Tuberculosis,2);
        
        // Display patient details along with diseases
        p.displayPatientInfo();
    }
}

