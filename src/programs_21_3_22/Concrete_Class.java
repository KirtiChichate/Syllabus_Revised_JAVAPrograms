package programs_21_3_22;

public class Concrete_Class extends Abstract_class{

	public static void main(String[] args) {
		
		Concrete_Class obj= new Concrete_Class();
		obj.method1();
		obj.method2();
		obj.method3();

	}

	@Override
	void method2() {
		System.out.println("this method2 is from abstract class which is completed in concrete class");
		
	}

	@Override
	void method3() {
		System.out.println("this method3 is from abstract class which is completed in concrete class");
		
	}
	
	

}
