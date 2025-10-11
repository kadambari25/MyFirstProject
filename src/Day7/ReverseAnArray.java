package Day7;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {100,200,300,400,500};
//understanding i= 0,  1 , 2,  3,  4
		for(int i=a.length-1;i>=0;i--) {   //after decrement, checks condition and prints.
			System.out.println(a[i]);
		}
	}

}
