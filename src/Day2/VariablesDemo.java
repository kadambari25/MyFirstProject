package Day2;

public class VariablesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a; //Declaration
	//	a=100; //Assignment
		
		int a= 100; // declaration+assignment
		System.out.println(a);
		
		a=200;  // no need to specify datatype again as it is already specified above for the same variable
		System.out.println(a);
		
		//Approach 1
		int b=100;
		int c=200;
		int d=300;
		
		//approach 2
		int e,f,g; //if the variables are of same data type
		e=200;
		f=300;
		g=400;
		
		//Two ways of printing
		System.out.println("The value of b is "+b);
		System.out.println("The value of c is "+c);
		System.out.println("The value of d is "+d);
		
		System.out.println(b+" "+c+" "+d);
		
		
		
		
		

	}

}
