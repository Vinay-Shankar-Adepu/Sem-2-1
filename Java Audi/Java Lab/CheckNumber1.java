/*
Given a number, check if the number (N) can be written as the form (k+1)*k. 
Write a java program to print those numbers in the given range.

Sample input:
10
Sample output:
2
6
*/
import java.util.Scanner;
class CheckNumber1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1; i<n; i++){
            if (((i*i)+i)<=n){
                System.out.println((i*i)+i);
            }
        }
    }
}