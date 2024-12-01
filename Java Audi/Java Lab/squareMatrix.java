/*Write a Java program to fill the below pattern into a square matrix:
The matrix has to be filled with numbers starting from 1. 
It has to start fill first row last column, last row (reverse), first column (reverse) 
and so on. Please refer the following example.

input = 5
output =
 1  2  3  4  5                                                                                                          
16 17 18 19  6                                                                                                          
15 24 25 20  7                                                                                                          
14 23 22 21  8                                                                                                          
13 12 11 10  9

*/
import java.util.Scanner;
class squareMatrix{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        int top=0;
        int bottom=n-1;
        int left=0;
        int right=n-1;
        int num=1;
        while(top<=bottom && left<=right){
            for (int i=left; i<=right; i++){
                a[top][i]=num++;
            }
            top++;
            for(int i=top; i<=bottom;i++){
                a[i][right]=num++;
            }
            right--;
            if(top<=bottom){
                for (int i=right; i>=left; i--){
                    a[bottom][i]=num++;
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    a[i][left]=num++;
                }
                left++;
            }
        }
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}