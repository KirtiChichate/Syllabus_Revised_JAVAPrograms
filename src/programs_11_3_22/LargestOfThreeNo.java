package programs_11_3_22;

import java.util.Scanner;

public class LargestOfThreeNo {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter th first no");
		int a= sc.nextInt();
		
		System.out.println("Enter th first no");
		int b= sc.nextInt();
		
		System.out.println("Enter th first no");
		int c= sc.nextInt();
		
	    if(a>b && a>c)
	    {
	    	System.out.println("A is the largest no");
	    }

	    if(b>c && b>a)
	    {
	    	System.out.println("B is the largest no");
	    }
	    
	    else
	    {
	    	System.out.println("C is the largest no");
	    }
	}

}
