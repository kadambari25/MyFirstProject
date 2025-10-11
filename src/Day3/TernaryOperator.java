package Day3;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// var = (exp) ? result1: result2;
		
		//Example1
		int a=10, b=20;
		 int x= (a<b)? a:b;
		 System.out.println(x); //returns  10; bec if the expression (a<b) returns true, a value gets assigned x,
		 						//if, it is false, b value gets assigned to x.
		 
		 //This way, u can check which no. is greater with the expression and the greater number gets assigned to the variable
		 
		 int c=5, d=6;
		 int e=(c>d)?c:d;
		 System.out.println(e); // 6, bec d gets assigned to e as the expression (c>d) returns false
		 
		 //example3
		 int k=(1==1)? 4:5;
		 System.out.println(k); // understand, 4 got assigned to k as the expression returns true.
		 
		 //Programming Example
		 
		 int person_age= 20;
		 String result= (person_age>18) ? "eligible" : "ineligible"; //any string ur using has to come inside quotes
		 System.out.println(result); // using string data type as we are storing string values.[eligible or ineligible].
		 
		 String Moving_Country= "Italy";
		 String result1 = (Moving_Country=="Italy")? "Bolzano": "Bremen"; // expression returns true, hence returning the first value that is Bolzano
		 String result2=(Moving_Country=="Germany")? "Bolzano": "Bremen"; 
		 String result3=(Moving_Country!="Italy")? "Bolzano": "Bremen"; 
		 System.out.println(result1);
		 System.out.println(result2);
		 System.out.println(result3);
		 
		
	}

}
