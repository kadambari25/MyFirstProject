package Day5;

public class WhileVsDowhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		while(i<=5) {
			System.out.println(i);
			i++; 
		}
		
		int j=10;
		do {
			System.out.println(j);
			j++;
		}while(j<=5);
	}

}

//in case1, since while loop checks the condition first, and as the condition fails, we get nothing in the result.
//in case2, in do while loop. first the execution happens for the first round and then the condition gets checked. so the first statement will get printed.
