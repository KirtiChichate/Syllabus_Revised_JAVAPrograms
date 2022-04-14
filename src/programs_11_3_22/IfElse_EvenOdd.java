package programs_11_3_22;

import java.util.Scanner;

public class IfElse_EvenOdd {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a no");
		int num=sc.nextInt();
		int even_no=0;
		int odd_no=0;
		
		
			if(num%2==0)
			{
				System.out.println("This is even no");
			}
			else
			{
				System.out.println("This is odd no");
			}
		
	}

}
