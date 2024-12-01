import java.util.Scanner;
class LeapYear{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Year: ");
        int n=sc.nextInt();
        if (n%4==0){
            System.out.println("Leap Year.");
        }
        else{
            System.out.println("Not a Leap Year.");
        }
    }
}