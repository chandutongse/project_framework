package dataType;

public class DataTypes {

	public static void main(String[] args) {
		/*
		 * data types collection of numers and chanraters
		 * there are two types of data types
		 * 1-primitive-pre define in libraty
		 * int 
		 * float
		 * double
		 * long 
		 * short
		 * char
		 * boolen
		 * byte
		 * 2-non primitive-user define
		 * string
		 * array
		 * object
		 * 
		 */
		//int holds numeric as well as char value
		int chanduage;//declaration
		chanduage=30;//assignment
		int ramage=30;//initialization-comabination of declaration and assignment
		
		System.out.println(ramage);
		ramage=32;
		System.out.println(ramage);
		//ramage=32.5;//not possible becasue int cant hold double value
		
		int jay='a';
		System.out.println(jay);//int hold char ascii value
		
		double chandusalary=100000.10;
		System.out.println(chandusalary);
		//double holds decimal as well as int value
		chandusalary=100000;
		System.out.println(chandusalary);
		
		//char hold chartor as well as numeric ascii char value
		char pawan='M';
		System.out.println(pawan);
		char a=97;//ans ascii value of 97
		System.out.println(a);
		char b=' ';//space show as char
		System.out.println(b);
		char c='9';//not possible ans is 9
		System.out.println(c);
		
		System.out.println(2>10);
		
		
		

	}

}
