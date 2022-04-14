package programs_15_3_22;

public class Inheritance_Class2 extends Inheritance_Class1{

	int a=2;
	String type="inheritance";
	int b=8;
	 final int z=10;
	public static void main(String[] args) {
		
		Inheritance_Class2 obj= new Inheritance_Class2();
		obj.test4();
	

	}
	
	protected void test3()
	{
		int a=6;
		int b=3;
		System.out.println("Addition of local and global variable :"+(a+this.a));
		System.out.println("this method is of "+type+" class");
	}
	
	private void test4()
	{
		System.out.println("Divide final and nonstatic global variable :"+z/a);
	}
	

}
