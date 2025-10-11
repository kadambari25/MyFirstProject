package Day3;

public class OperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =100;
		int b= 200;
		
		//Arithmetic operators +,-,*,/,%
		int result = a+b;
		System.out.println("The sum of a and b is "+result);
		System.out.println("The subtraction of a and b is "+(a-b));
		System.out.println("The multiplication of a and b is "+(a*b));
		System.out.println("The division of a and b is "+(a/b)); // This gives u the reminder
		System.out.println("The modular didvision of a and b is "+(a%b)); // This gives u the quotient
		
		//Relational or comparision operators
		//Returns boolean values as it compares two values. [True or False]
		
		System.out.println(a>b); //False
		System.out.println(a<b); //True
		System.out.println(a<=b); //true
		System.out.println(a>=b); //false
		b=100;
		System.out.println(a<=b); //true
		System.out.println(a>=b); //true
		System.out.println(a!=b); //false as b value is changed
		System.out.println(a==b); //true
		
		boolean res= a>b; //[We store the data in boolean type of variable
		System.out.println("The result of the comparision is"+res);
		
		//Logical Operators; returns true or false &&, ||, !
		// Works between two boolean variables or expressions
		
		boolean x= true;
		boolean y= false;
		
		System.out.println(x&&y);//false
		System.out.println(x||y); //true
		System.out.println(!x); //false
		System.out.println(!y); //true
		
		boolean results= x&&y;
		System.out.println("The result is "+results);
		
		boolean b1=10>20; //false
		boolean b2= 20>10; //true
		System.out.println(b1&&b2); //false
		System.out.println(b1||b2); //true
		
		System.out.println((10>20)||(10<20)); //here we are using boolean expressions instead of boolean variables
		
		
	}

}
