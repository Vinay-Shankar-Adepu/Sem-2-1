import java.util.Scanner;
class SpecialNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();
        int k=n;
        int t=0;
        int a[]=new int[10];
        while(k!=0){
            a[t]=k%10;
            t++;
            k=k/10;
        }
        int s=0;
        for (int i=0; i<a.length; i++){
            if (a[i]!=0){
                int fact=1;
                int h=a[i];
                while(h!=0){
                    fact=fact*h;
                    h--;
                }
                s=s+fact;
            }
        }
        if (s==n){
            System.out.println("Special number.");
        }
        else {
            System.out.println("Not a special number.");
        }
    }
}