package Day3;

public class IncrementOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a =10;
			
			a++;
			System.out.println(a);
			
			int b=10;
			int result =b++;
			System.out.println(result); //returns 10, bec first the assignment is happening then it is getting incremented.
			//So first the value of b is assigned to result as 10 and then a gets incremented by 1.
			System.out.println(b); //11; you can see it is actually incremented, but it is incremented post assignment
			b++;
			System.out.println(b);
			//Hence it is called post increment
			
			
			int c= 10;
			int results= ++c; //11
			//Here a is getting incremented by 1 first and then getting assigned to the results.
			//So this is called pre increment
			System.out.println(c); //11
			
	}

}
