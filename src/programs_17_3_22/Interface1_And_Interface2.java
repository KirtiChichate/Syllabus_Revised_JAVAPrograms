package programs_17_3_22;

public class Interface1_And_Interface2 implements Interface1,Interface2 {

	int a=5;
	String Name="Kirti";
	
	public static void main(String[] args) {
		
		Interface1_And_Interface2 obj= new Interface1_And_Interface2();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();

	}

	@Override
	public void method3()
	{
		
		System.out.println("------Its 1st method from interface2------");
		int a=10;
		System.out.println("Addition of two variables"+(a+this.a));
		
	}

	@Override
	public void method4() {
		System.out.println("------Its 2nd method from interface2------");
		System.out.println("My Name is: "+this.Name);
		
	}

	@Override
	public void method1() {
		System.out.println("------Its 1st method from interface1------");
		int a=10;
		int b=5;
		System.out.println("Mul of two no is :"+a*this.a*b);
	}

	@Override
	public void method2() {
		System.out.println("------Its 2nd method from interface1------");
		double a=10.12;
		System.out.println("sub of two no is :"+(a-this.a));
		
	}
	
	

}
