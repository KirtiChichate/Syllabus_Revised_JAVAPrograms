package programs_11_3_22;

import java.util.Scanner;

public class If_Else_Study {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a no");
		int num=sc.nextInt();
		
		int org_num=num;
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
	
		if(org_num==rev)
		{
			System.out.println(org_num+"this no is palindrome no");
		}
		else
		{
			System.out.println(org_num+"this no is not a palindrome no");
		}

	}

}
