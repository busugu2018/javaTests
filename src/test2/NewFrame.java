package test2;

import java.time.LocalDate;

import java.time.LocalDateTime;

import java.util.Date;


public class NewFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("New class created.");
		//This is a comment
		
		int number = 100;
		double decimal = 100.01;
		String brand = "Nike";
		
		
		//primitive Datatypes:   --> type variableName = value; <--
		
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
		
		LocalDateTime localDateTime = LocalDateTime.now();
		
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
		
		
		//Class, object
		String name1 = new String("Johnny"); // Class = String and object = name1
		System.out.println(name1);
		System.out.println(name1.toUpperCase()); //method = toUpperCase  -- a method is a behavior
		System.out.println(name1.charAt(0));
		System.out.println(name1.charAt(1));
		System.out.println(name1.charAt(5));
		System.out.println(name1.contains(name1));
		System.out.println(name1.contains(name));
		
		
		
		String name2 = "Jona";//[String name1 = "Johnny"] and [String name1 = new String("Johnny")]   are the same
		String code = "codes";
		System.out.println(name2.contains(name1));
		System.out.println(name2.contains(name2));
		
		//---------------------------------------------------------------------------------------------------------------	
		/*reserved keywords are:
		package, public, class, static, void, main
		Cant't use them as names of objects
		for example: int public = 0; <-- that'd be wrong.
		for example: int void = 0; <-- that'd be wrong.
		for example: int class = 0; <-- that'd be wrong.
		for example: int static = 0; <-- that'd be wrong.
		for example: int main = 0; <-- that'd be wrong.*/
		
		//---------------------------------------------------------------------------------------------------------------	
		//Arithmetic operations:
		System.out.println(10+20); 
		System.out.println(2-29); 
		System.out.println(72*0.049); 
		System.out.println(983/52);
		System.out.println(762%8); 
		//---------------------------------------------------------------------------------------------------------------	
		//The math class
		System.out.println(Math.PI);
		System.out.println(Math.abs(-.39));
		System.out.println(Math.acos(90));
		System.out.println(Math.max(92834.938475629485637, 923.93847563));
		System.out.println(Math.multiplyFull(theByte, -theByte));
		//---------------------------------------------------------------------------------------------------------------	
		//comparison operations
		int miaAge = 2;
		int nonkwoAge = 29;
		int myAge = 33;
		int brittaniAge = 29;
		boolean whosOlder = miaAge>nonkwoAge;
		boolean whosYounger = miaAge<nonkwoAge;
		boolean sameAge = brittaniAge == nonkwoAge;
		boolean differentAge = nonkwoAge != miaAge;
		boolean greaterOrEqual = myAge >= nonkwoAge;
		boolean lesserOrEqual = miaAge <= myAge;
		System.out.println(whosOlder);
		System.out.println(whosYounger);
		System.out.println(sameAge);
		System.out.println(differentAge);
		System.out.println(greaterOrEqual);
		System.out.println(lesserOrEqual);
		//---------------------------------------------------------------------------------------------------------------	
		//Logical Operations
		
		//my example
		// To pass your class you need an average minimum grade of C of 3 exams, 70>=Grade<=100. 
		//Here are your grades for exam1, 2, and 3. 
		//exam1: 85
		//exam2: 76
		//exam3: 62
		//Are you passing the class?
		
		
		//student 1
		int exam1 = 85;
		int exam2 = 76;
		int exam3 = 62;
		//grade = [(exam1+exam2+exam3)/3]
		int passingFinalGrade = (exam1+exam2+exam3)/3;
		boolean finalGrade = (passingFinalGrade >= 70) && (passingFinalGrade<=100);
		boolean finalGrade1 = (passingFinalGrade >= 70) || (passingFinalGrade<=100); //<-- that'd be wrong
		System.out.println(finalGrade);
		System.out.println(finalGrade1);
		
		//student2
		int examA = 65;
		int examB = 76;
		int examC = 62;
		int passingFinalGradeABC = (examA+examB+examC)/3;
		boolean finalGradeABC = (passingFinalGradeABC >= 70) || (passingFinalGradeABC<=100); // <-- that code is wrong , simply because passingFinalGradeABC = 67 which is less than the -- finalGrade which should be >=70 and <=100 -- so "OR" pushes it below 70.
		System.out.println(finalGradeABC);
		
		//example from amigosCode
		boolean isAdult1 = false;
		boolean isStudent = false;
		boolean isAmigosCodeMember = true;
		System.out.println((!isAdult1 || isStudent) && !isAmigosCodeMember);
		System.out.println(10 > 8 && 2.00 <= 2
				&& !isAdult1
				&& name.contains("M"));
		
		
		
		//---------------------------------------------------------------------------------------------------------------
		//To keep everything on the same line, use "print()":
		
		System.out.print("During the compilation phase, the Java compiler compiles the source code and\n"
				+ "generates bytecode.");
		System.out.print("This intermediate bytecode is saved in form of a .class file.");
		
		
		//---------------------------------------------------------------------------------------------------------------
		
		/* multi line comment*/
		
		// One line comment
		
		
		
	}
	//---------------------------------------------------------------------------------------------------------------	
		
		
				
	
	
	
	
	
	
	static class Person {
		String name;
		
		Person(String name){
			this.name = name;
		}
	}

}
