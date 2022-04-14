package programs_15_3_22;

public class Polymorphisms_Methodoverloading {

	public static void main(String[] args) {
		
		Polymorphisms_Methodoverloading obj= new Polymorphisms_Methodoverloading();
		obj.test1();
		obj.test1(5, 5.23f);
		obj.test1(5, 10);
		obj.test1(20, "polymorphisms", 2);
		

	}
	
	public void test1()
	{
		String topic="Methodoverloading";
		System.out.println("This is program of "+topic);
	}
	
	private void test1(int a, int b)
	{
		int sum=a+b;
		System.out.println("Addition of test1 is "+sum);
	}
	
	void test1(int a, float b)
	{
		float mul=a*b;
		System.out.println("Multiplication is "+mul);
	}
	
	protected void test1(int a, String Name, double b )
	{
		double div=a/b;
		System.out.println(Name);
		System.out.println("division is "+div);
	}

}
