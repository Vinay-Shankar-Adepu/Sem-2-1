import java.util.Scanner;
class SpyNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        int k=n;
        int t=0;
        int a[]=new int[10];
        while(k!=0){
            a[t]=k%10;
            t++;
            k=k/10;
        }
        int x=0;
        for (int i=0; i<a.length; i++){
            if (a[i]!=0){
                x++;
            }
        }
        int f=1;
        int g=0;
        for (int i=0; i<x; i++){
            f=f*a[i];
        }
        for (int i=0; i<x; i++){
            g=g+a[i];
        }
        if (f==g){
            System.out.println("Spy Number.");
        }
        else{
            System.out.println("Not a Spy Number.");
        }
    }
}