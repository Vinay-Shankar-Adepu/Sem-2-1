import java.util.Scanner;
class MaxDifference{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for (int i=0; i<n; i++){
        a[i]=sc.nextInt();
    }
    int max=a[0];
    for (int i=0; i<n; i++){
    if (a[i]>max){
        max=a[i];
    }

    int min=a[1];
    for(int i=0; i<n; i++){
        if (a[i]<min){
            min=a[i];
        }
    }
    int t-max-min;
    System.out.println(t);
    }
}