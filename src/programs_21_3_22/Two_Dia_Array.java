package programs_21_3_22;

public class Two_Dia_Array {

	public static void main(String[] args) {
	
		int num[][]= {{1,2},{3,4}};
		
		for(int a=0; a<=num.length-1; a++)
		{
			for(int b=0; b<=num.length-1; b++)
			{
				System.out.print(num[a][b]+" ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println();
		
		int numm[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int c=0; c<=numm.length-1; c++)
		{
			for(int d=0; d<=numm.length-1; d++)
			{
				System.out.print(numm[c][d]+" ");
			}
			System.out.println();
		}

	}

}
