package Day5;

public class ForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printing 0 to 10.
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
		
		//printing even numbers
		for(int j=2;j<=10;j=j+2) {
			System.out.println(j);
		}
		
		//another approach
		for(int k=0;k<=10;k++) {
			if(k%2==0) {
				System.out.println(k+ " is an even number");
			}else {
				System.out.println(k+" is an odd number");
			}
		}
		
		//printing 10 to 1
		for(int m=10;m>0;m--) {
			System.out.println(m);
		}
	}

}
