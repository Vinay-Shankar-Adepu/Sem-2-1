import java.util.Scanner;
class DuckNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        String n=sc.next();
        if(n.contains("0") && n.charAt(0)!='0'){
            System.out.println("Duck Number.");
        }
        else {
            System.out.println("Not a Duck Number.");
        }
    }
}