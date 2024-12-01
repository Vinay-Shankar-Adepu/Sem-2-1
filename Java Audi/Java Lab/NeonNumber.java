import java.util.Scanner;
class NeonNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        int k=n*n;
        int t=0;
        int a[]=new int[10];
        while(k!=0){
            a[t]=k%10;
            t++;
            k=k/10;
        }
        int x=0;
        for (int i=0; i<a.length; i++){
            x=x+a[i];
        }
        if (x==n){
            System.out.println("Neon Number.");
        }
        else{
            System.out.println("Not a Neon Number.");
        }
    }
}