package test2;

import java.time.LocalDate;
import java.util.Date;

public class NewFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("New class created.");
		//This is a comment
		
		int number = 100;
		double decimal = 100.01;
		String brand = "Nike";
		
		
		//primitive Datatypes:
		
		//these are reserved keywords:
		//byte, short, int, long, float, etc cant use it in same lane why we used theByte, theShort, theLong etc
		
		byte theByte = -128; // byte stores whole # from -128 to 127
		short theShort = 9_379; // short whole numbers from -32768 to 32767
		int theInt = 297_824_676;// int whole numbers from -2147483648 to 2147483647
		long theLong = 9_874_983_945_785_745L; // long stores whole # from -128 to 127
		float theFloat = 891.8_574_584F; // float stores 6 to 7 decimal
		double theDouble = 38.38475736; // double stores 15 decimals
		boolean isAdult = true;
		char nameInitial = 'A';
		
		System.out.println(theByte);
		System.out.println(theShort);
		System.out.println(theInt);
		System.out.println(theLong);
		System.out.println(theFloat);
		System.out.println(theDouble);
		System.out.println(isAdult);
		
		//reference type
		Date date = new Date();
		
		//"new" is a reference types
		
		/*String name = new String (original: "amigoscode");
		System.out.println(name);*/
		
		String name = new String("John");
		System.out.println(name.toUpperCase());
		
		LocalDate now = LocalDate.now();
		System.out.println(now.getMonth());
		System.out.println(now.getDayOfMonth());
		System.out.println(now.getDayOfYear());
		
		//Primitives VS Reference Types:
		
		//Primitives
		int a = 10;
		int b = a;
		a = 100;
		System.out.println("a = " + a + " - b = " + b);

		
		//References
		Person alex = new Person("alex");
		Person mariam = alex;
		
		System.out.println("Before changing alex");
		System.out.println(alex.name + " " + mariam.name);
		
		alex.name = "Alexander";
		
		System.out.println("After changing alex");
		System.out.println(alex.name + " " + mariam.name);
	}
	
	
	
	
	static class Person {
		String name;
		
		Person(String name){
			this.name = name;
		}
	}

}
