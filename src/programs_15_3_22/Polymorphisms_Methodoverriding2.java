package programs_15_3_22;

public class Polymorphisms_Methodoverriding2 extends Polymorphisms_Methodoverriding {

	public static void main(String[] args) {
		
		Polymorphisms_Methodoverriding2 obj= new Polymorphisms_Methodoverriding2();
		obj.overriding();
		
		
	}
	
	public void overriding()
	{
		String city="Pune";
		System.out.println("MY city is "+city);
		double a=10.12458;
		int b=45;
		System.out.println("subtraction of two num "+(b-a));
	}

}
