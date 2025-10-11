package Day3;

public class DecrementOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =100;
	//	a=a-1;
		a--;
		System.out.println(a);
		
		int b=20;
		int result= b--;
		System.out.println(result); //20, bec it is getting decremented after assignment. hence post decrement
		System.out.println(b); //19 , ideally value is decremented.
		
		int c= 30;
		int result1= --c;
		System.out.println(result1); //29 , pre decrement, then assignment
		System.out.println(result1); //29
		c--;
		System.out.println(c); //28
		
		
		
		
	}

}
