/* Write a java program to check whether the given number is gapful or not.
A number is gapful if it is at least 3 digits long and is divisible 
by the number formed by stringing the first and last numbers together. 
The smallest number that fits this description is 100. 
First digit is 1, last digit is 0, forming 10, which is a factor of 100. 
Therefore, 100 is gapful. Print "Yes" if it is gapful otherwise "No".


Examples
case=1
input=100
output=Yes

case=2
input=103
output=No

case=3
input=105
output=Yes

*/
import java.util.Scanner;
class GapfulNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("input=");
        int n=sc.nextInt();
        String k=Integer.toString(n);
        int x=k.charAt(0)-'0';
        int y=k.charAt(k.length()-1)-'0';
        int f=x*10+y;
        if (n%f==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}