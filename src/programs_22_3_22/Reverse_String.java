package programs_22_3_22;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.next();
		String rev_str=" ";
		int len=str.length();
		
		for(int i=len-1; i>=0; i--)
		{
			rev_str= rev_str+str.charAt(i);
		}
		System.out.println("Reversed String is: "+rev_str);

	}

}
