package program_10_3_22;

public class Methods_Study {

	public static void main(String[] args) {
			method();
		Methods_Study obj= new Methods_Study();
		obj.method1();
			obj.study();
			obj.method2(80, 10);
	}
	public Methods_Study()
	{
		String s1="I want a new job";
		String s2="In IT Industry";
		String sum=s1+s2;
		System.out.println(sum);
	}
	public void study()
	{
		System.out.println("This is combination of method_study and study");
	}	
    public static void method()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("Sum of two number is "+sum);
		    
	}	
	public void method1()
	{
		int a=5;
		int b=15;
		int mul=a*b;
		System.out.println("Multiplication of two number is: "+mul);
		
	}
	public void method2(int a, int b)
	{
		int sum= a/b;
		System.out.println(sum);
	}
}
