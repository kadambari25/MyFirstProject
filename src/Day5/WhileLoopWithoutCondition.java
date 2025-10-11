package Day5;

public class WhileLoopWithoutCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while(true) {
			System.out.println("Hello");
			i++;
			if(i==10) {
				break;   // if break isn't there, it will execute forever
			}
		}
	}

}
