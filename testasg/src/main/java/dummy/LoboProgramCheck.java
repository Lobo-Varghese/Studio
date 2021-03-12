package dummy;

import java.util.Scanner;

public class LoboProgramCheck {
	
			// reverse a String
			// swap two variable(with without variable)
			// reverse a number
			// triangle pattern
			// length of a string without length method
			// find smallest numberin array
			// revers a word in sentence
			// find element present in array or not
			// find alphabet position
			// find occurance of a character
			// replace vowels with special character
			// remove leading and trailing white spaces
			// get numeric values from string and add
			// prime number from 1 to 100

	public static void main(String[] args) {		
		
		//reverseWithArray();
		//reverseUsingStringBuilder();
		//swapWithVariable();
		//swapWithoutVariable();
		reverseNumber();
	}
	
	/**reverse a String**/
	public static void reverseWithArray() {
	String rev = "Lobo";
	char[] charval = rev.toCharArray();
	for(int i=charval.length-1;i>=0;i--) {
		System.out.print(charval[i]);
	}
	}
	
	/**Reverse a string using String Builder**/	
	
	public static void reverseUsingStringBuilder() {
	String name= "LoboVarghese";
	StringBuilder strbuild = new StringBuilder(name);
	strbuild.reverse();
	System.out.println(strbuild);
	}
	
	/**swap two variable(with without variable)**/
	
	public static void swapWithVariable() {
		int a= 10;
		int b= 20;
		int temp;
		
		temp = a;
		a= b ;
		b=temp;
		
		System.out.println("a="+a +" "+"b="+b);		
	}
	
	public static void swapWithoutVariable() {
		int a = 10;
		int b= 20;
		a= a+b;
		b= a-b;
		a=a-10;
		
		System.out.println("a="+a+" "+"b="+b);
	}
	
	/**Reverse a Number**/
	
	public static void reverseNumber() {
			
		/*int che = num;
		String stringNum = String.valueOf(che);
		int len = stringNum.length();		
		System.out.println(len);*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("EnterNumber");
		int num= scan.nextInt();
		int rev = 0;
		int val = 0;
		while (num>0) {
			
			rev = rev*10;
			val = num%10;			
			rev= rev+val;
			num = num/10;
			
		}
		System.out.println(rev);		
	}
	
	
	/**Triangle Pattern**/
	
	public static void trianglePattern() {
		
		for (int i = 0; i <= 0; i++) {
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
