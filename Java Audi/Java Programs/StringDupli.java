import java.util.Scanner;
class StringDupli
{
	public static void main(String[] arg){
		String s[]=new String[3];
		Scanner sc=new Scanner(System.in);
		for (int i=0; i<s.length; i++){
			System.out.println("Name:");
			s[i]=sc.next();
		}
		for (int i=0; i<s.length; i++){
			System.out.println("Hello "+s[i]);
		}
		int c[]=new int[s.length];
		for (int i=0; i<s.length; i++){
			for (int j=0; j<s.length; j++){
				if (s[i].equals(s[j])){
					c[i]++;
				}
			}
		}
		for (int i=0; i<c.length; i++){
			if (c[i]>1){
				System.out.println("Duplicat: "+s[i]);
				break;
			}
		}
		sc.close();
	}
}
/* The two ways of creating a string is either declaring directly or using the "new" operator.
   The latter causes the string to be not stored in the constant pool but on the heap. Doing that makes
   the compiler think that the 2 of them are of different values and hence ".equal" function is used in this 
   program to compare.*/