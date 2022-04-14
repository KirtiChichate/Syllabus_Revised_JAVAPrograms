package programs_11_3_22;

import java.util.Scanner;

public class NestedIfElse_program {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the marks to check the performance of student");
		int marks=sc.nextInt();
		
		if(marks>=35 && marks<=95)
		{
			System.out.println("it shows a passed status, so check performance");
			
		if(marks>=41 && marks<=60)
		{
				System.out.println("This is average marks,so this is count as a average performance");
		}	
		if(marks>=61 && marks<=75)
		{	
				System.out.println("This is a good marks,so this is count as a above average performance");
		}	
		if(marks>=76 && marks<=90)
		{
			System.out.println("this is a best marks, so this is count as a bestest perfomance");
		}
		}
		else
		{
			System.out.println("This is not considerable marks,it shows failed status");
		}

	}

}
