package Day7;

import java.util.Scanner;

public class TakingInputFromKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);  //scanner class is used to take input from keyboard. System. in we add bec w are taking input from the system.
		
		System.out.println("Enter a number");  			 //works even without this, this is for our understanding
		int num= sc.nextInt();  						 //this is to take int as an input, storing in a variable num
		System.out.println("The number entered "+num);   //printing it
		
		System.out.println("Enter your decimal number");
		double d=sc.nextDouble();
		System.out.println("The decimal number entered is "+d);
		
		System.out.println("Enter your city");
		String city= sc.next();    //for string it is only next();
		System.out.println("The city entered is "+city);
	}

}
