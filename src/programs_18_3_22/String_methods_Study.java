package programs_18_3_22;

public class String_methods_Study {

	public static void main(String[] args) {
		String city="Pune";
		String Name=new  String("Kirti");
		String surname="Chichate";
		String space=" ";
		String Education= new String("Bachlour@ of engg");
		String Subject="Software testing";
		String upp="PULGAON";
		String equ="Pulgaon";
		String spli="I_want_tobe_QA";
		
		String refobj="_";
		String[] obj=spli.split(refobj);
		for(int a=0; a<=obj.length-1; a++)
		{
			System.out.println("");
		}
		
		
		int len = city.length();
		System.out.println("Length of city is :"+len);

		System.out.println("print Name is in uppercase:  "+Name.toUpperCase());
		System.out.println("Print Name is in Lowercase:  "+upp.toLowerCase());
		System.out.println("check two string is equals or not:   "+upp.equals(equ));
		System.out.println("check two string is equals or not by ignoring case:  "+upp.equalsIgnoreCase(equ));
		System.out.println("check contains char or not:  "+Subject.contains("Soft"));
		System.out.println("Is this String is empty:  "+space.isEmpty());
		System.out.println("Is this String is blank:  "+space.isBlank());
		System.out.println("Char at in Education:  "+Education.charAt(8));
		System.out.println("Is this string is ends with this char or not:  "+upp.endsWith("aon"));
		System.out.println("Is this string is start with this char or not:  "+upp.startsWith("PULG"));
		System.out.println("substring of subject is:  "+Subject.substring(9));
		System.out.println("concat Name and surname:  "+Name.concat(surname));
		System.out.println("Index of n from city string:  "+city.indexOf('n'));
		System.out.println("Last index of string Name is:  "+Name.lastIndexOf("rti") );
		System.out.println("replace space by some char:  "+space.replace(" ", "Kitti"));
		
	}

}
