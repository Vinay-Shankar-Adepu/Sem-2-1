import java.util.*;
import java.io.*;
class bmi{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your weight in KG");
		byte weight = sc.nextByte();
		System.out.println("Enter your height in Feet");
		byte feet = sc.nextByte();
		System.out.println("Enter your height in inches");
		byte inch = sc.nextByte();
		double f = ((feet*12) +inch)*0.0254;
		System.out.println(f);
		double d = weight/(f*f);
		System.out.println(d);
		if (w > 20){
			System.out.println("A");			
}
		
}
}