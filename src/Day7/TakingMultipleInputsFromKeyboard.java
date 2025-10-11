package Day7;

import java.util.Scanner;

public class TakingMultipleInputsFromKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);  //remember to import scanner class
		
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		
		System.out.println("Enter second number");
		int num2= sc.nextInt();
		
		System.out.println("Addition of 2 numbers "+(num1+num2));
		
		
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("Your name is "+name);
		
		System.out.println("Enter your age");
		int age= sc.nextInt();
		System.out.println("Your age is "+age);
		
		System.out.println("Enter unknown value");
		Object value=sc.next();   //.next will accept any data that u add as string. and it will be stored in variable "value" bec it is of type object.
		System.out.println("The unknown value is "+value);  //if u enter a int data to value, and then u wanna perform some integer operation on it, then u shud convert that data into int.bec now it has stored ur value as string
	}

}
