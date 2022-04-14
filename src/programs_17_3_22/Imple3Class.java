package programs_17_3_22;

public class Imple3Class implements Intf1,Interface1,Interface2{

	public static void main(String[] args) {
	
		Imple3Class obj= new Imple3Class();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
		obj.method5();

	}

	@Override
	public void method3() {
		System.out.println("----This is method3 from interface 2------");
		
	}

	@Override
	public void method4() {
		System.out.println("----This is method4 from interface 2------");
		
	}

	@Override
	public void method1() {
		System.out.println("----This is method1 from interface 1------");
		
	}

	@Override
	public void method2() {
		System.out.println("----This is method2 from interface 1------");
		
	}

	@Override
	public void method5() {
		System.out.println("----This is method5 from interface 3------");
	}

}
