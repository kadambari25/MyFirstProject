package Day5;

public class ContinueStatementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i); //result will be all no.s without 5, bec when continue gets executed, the control will go to incrementing instead of printing
		}
		
		//skipping 3,5,9
		
		for(int j=0;j<=10;j++) {
			if(j==3|| j==5|| j==9) {
				continue;
			}
			System.out.println(j);
		}
	}

}
