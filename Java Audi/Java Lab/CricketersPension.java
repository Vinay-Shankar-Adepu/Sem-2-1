/*Cricketer's Pension Continuing our journey in mastering the conditional statements & our interest with cricket.
Let us help the Indian cricket's governing body (BCCI) to 
automate its plan of allotting pensions to former players. 
The rules are given below:  
If a player has played more than 10 test matches and 100 ODI's he receives Rs.50,000.
If a player has played more than 10 test matches he receives Rs.25,000.
If a player has played more than 100 ODI's he receives Rs.15,000.
If a player has played for India he receives Rs.10,000.
The amount is incremented by 1/4th for every 'man of the match' 
award.
If a player has not played for India but played IPL he receives an amount of Rs.8,000. 
If a player has not played for India nor IPL he receives an amount of Rs.7,000.

Sample IO 1:
------------
Has he played for India?                                                                                                
y                                                                                                                       
Has he played IPL?                                                                                                      
y                                                                                                                       
Enter no of Testmatches                                                                                                 
5                                                                                                                       
Enter no of ODIs                                                                                                        
6                                                                                                                       
Enter the number of man of the matches                                                                                  
10                                                                                                                      
35000.0                                                                                                                 

*/
import java.util.Scanner;
class CricketersPension{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Has he played for India?");
        String ind=sc.next();
        System.out.println("Has he played IPL?");
        String ipl=sc.next();
        System.out.println("Enter no of Testmatches  ");
        int tm=sc.nextInt();
        System.out.println("Enter no of ODIs ");
        int odi=sc.nextInt();
        System.out.println("Enter the number of man of the matches");
        int mm=sc.nextInt();
        float r=0.0f;
        if (ind.equals("y") && ipl.equals("y") && tm>10 && odi>100){
            r=50000.0f+(0.25f*50000f*mm);
        }
        else if(ind.equals("y") && ipl.equals("y") && tm>10){
            r=25000.0f+(0.25f*25000f*mm);
        }
        else if(ind.equals("y") && ipl.equals("y") && odi>100){
            r=15000.0f+(0.25f*15000f*mm);
        }
        else if(ind.equals("y")){
            r=10000.0f+(0.25f*10000f*mm);
        }
        else if(ind.equals("n") && ipl.equals("y")){
            r=8000.0f+(0.25f*8000f*mm);
        }
        else if(ind.equals("n") && ipl.equals("n")){
            r=7000.0f+(0.25f*7000f*mm);
        }
        System.out.println(r);
    }
}