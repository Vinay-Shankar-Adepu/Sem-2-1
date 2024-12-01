import java.util.Scanner;
class Bulbobj{
    public static void main(String[] args){
        Bulb b=new Bulb();
        Scanner sc=new Scanner(System.in);
        b.Shape=sc.next();
        b.Type=sc.next();
        b.Price=sc.nextFloat();
        b.Power=sc.nextShort();
        b.SupportIot=sc.nextBoolean();
        b.ColorOfLight=sc.next();
        b.Brand=sc.next();

        b.TurnOn();
        b.TurnOff();
    }
}