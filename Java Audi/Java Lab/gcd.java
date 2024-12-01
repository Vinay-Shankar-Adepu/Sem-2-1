import java.util.Scanner;
class gcd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int gcd=1;
        for (int i=1; i<=Math.min(a,b); i++){
            if (a%i==0 && b%i==0){
                gcd=i;
            }
        }
        System.out.println("Their GCD is: " + gcd);
    }
}