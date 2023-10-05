package test2;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hey Guys");
		System.out.println("I'm back to learning Java.");
		System.out.println("Test");
		
		//arrays
		
		int zero = 0;
		int one = 1;
		
		int [] listOfNumbers1 = new int[5];
		System.out.println(Arrays.toString(listOfNumbers1));
		
		int [] listOfNumbers2 = new int[1];
		System.out.println(Arrays.toString(listOfNumbers2));
		
		boolean [] listOfNumbers3 = new boolean[3];
		System.out.println(Arrays.toString(listOfNumbers3));
		
		String [] employeeInfos =new String[2];
		System.out.println(Arrays.toString(employeeInfos));
		
		int [] arrayNumba = new int[6];
		arrayNumba[0]=8945;
		arrayNumba[1]=87;
		arrayNumba[2]=234;
		arrayNumba[3]=2;
		arrayNumba[4]=56;
		arrayNumba[5]=32834;
		System.out.println(Arrays.toString(arrayNumba));
		
		int [] numbaList = {84,827,36,283475,667389,1,345,243,667};
		System.out.println(Arrays.toString(numbaList));
		System.out.println(numbaList.length);
		
		String [] clientFNames = {"John","Jo","Jane","kao","Hu","Ellen"};
		System.out.println(Arrays.toString(clientFNames));
		
		
		String [] clientFNamesGrab = {"John","Jo","Jane","kao","Hu","Ellen"};
		String getIndexNumber3 = clientFNamesGrab[3];
		String getIndexNumber5 = clientFNamesGrab[5];
		System.out.println(getIndexNumber5);
		System.out.println(clientFNamesGrab.length);
		
		
		///----------------------------------------------
		
		//Operators
		
		/*		 =	x = 5	x = 5	
				+=	x += 3	x = x + 3	
				-=	x -= 3	x = x - 3	
				*=	x *= 3	x = x * 3	
				/=	x /= 3	x = x / 3	
				%=	x %= 3	x = x % 3	
				&=	x &= 3	x = x & 3	
				|=	x |= 3	x = x | 3	
				^=	x ^= 3	x = x ^ 3	
				>>=	x >>= 3	x = x >> 3	
				<<=	x <<= 3	x = x << 3
				
				==	Equal to	x == y	
				!=	Not equal	x != y	
				>	Greater than	x > y	
				<	Less than	x < y	
				>=	Greater than or equal to	x >= y	
				<=	Less than or equal to	x <= y
				
				&& 	Logical and	Returns true if both statements are true	x < 5 &&  x < 10	
				|| 	Logical or	Returns true if one of the statements is true	x < 5 || x < 4	
				!	Logical not	Reverse the result, returns false if the result is true	!(x < 5 && x < 10)	

				
		*/
		
		
		
		///----------------------------------------------
		//Loops
		int [] numberLoop1 = {8923,98724,743,78,9}; 
		for (int i = 0; i<numberLoop1.length; i++) {
			System.out.println(numberLoop1[i]);
		}
		//reverse loop
		for (int i =numberLoop1.length-1; i>=0; i-- ) {
			System.out.println(numberLoop1[i]);
		}
		
		int numberLoop2 = 99;
		numberLoop2++;
		System.out.println(numberLoop2);
		
		int addTen = 26;
		addTen+=10;
		System.out.println(addTen);
		
		
		
		
		
		
		
		
		
		
	}

}
