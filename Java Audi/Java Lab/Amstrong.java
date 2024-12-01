import java.util.Scanner;
class Amstrong{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        int k=n;
        int t=0;
        int r=0;
        int a[]=new int[5];
        while(k!=0){
            a[t]=k%10;
            t=t+1;
            k=k/10;
        }
        int x=0;
        for (int i=0; i<a.length; i++){
            if (a[i]!=0){
                x=x+1;
            }
        }
        for (int i=0; i<x; i++){
            r=r+(int)Math.pow(a[i],x);
        }
        if (r==n){
            System.out.println("Armstrong Number.");
        }
        else{
            System.out.println("Not an Armstrong Number.");
        }
    }
}