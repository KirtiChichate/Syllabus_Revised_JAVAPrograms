package programs_11_3_22;

public class Switch_Program {

	public static void main(String[] args) {
		
		String Day="sunday";
		
		switch (Day)
		{
		case "Monday":
			System.out.println("This is 1st day of week");
			
		case "Tuesday":
			System.out.println("This is the 2nd day of week");
			
		case "wednesday":
			System.out.println("This is the 3rd day of week");
		
		case "Thursday":
			System.out.println("This is the 4th day of week");
			
		case "Friday":
			System.out.println("This is the 5th day of week");
			
		case "saturday":
			System.out.println("This is the last day of weekend");
			
		case "sunday":
			System.out.println("This is a holiday");
		}
		
		

	}

}
