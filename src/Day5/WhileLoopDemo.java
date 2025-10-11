package Day5;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printing numbers 1 to 10
		int i=1; //initialization
		
		while(i<=10) {  //condition
			System.out.println(i);
			i++;        //incrementation
		}
		
		//printing hello  message 10 times
		int k= 1;
		
		while(k<=10) {
			System.out.println("Hello");
			k++;
		}
		
		//printing even numbers from 1 to 10
		//approach1
		int j=2;
		while(j<=10) {
			System.out.println(j);
			j+=2; //j=j+2
		}
		
		//approach2
		int s=1;
		while(s<=10) {
			if(s%2==0) {
			System.out.println(s);
			}
			s++;
		}
		
		//Example: print even and odd numbers both with naming
		int m= 1;
		while(m<=10) {
			if(m%2==0) {
			System.out.println(m+" is a even number");
			} else {
				System.out.println(m+" is a odd number");
			}
			m++;
		}
		
		//print 10 to 1
		int z=10;
		while(z>0) {
			System.out.println(z);
			z--;
		}
	}

}
