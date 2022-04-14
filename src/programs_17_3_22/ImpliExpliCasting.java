package programs_17_3_22;

public class ImpliExpliCasting {

	public static void main(String[] args) {
	
		ImpliExpliCasting obj= new ImpliExpliCasting();
		obj.method1();
		
	}	
		public void method1()
	{
		int a=10;
		double b=a;
		System.out.println("the output of b is :"+b);
		float c=a;
		System.out.println("The output of c is :"+c);
		
		
	}
	
}
