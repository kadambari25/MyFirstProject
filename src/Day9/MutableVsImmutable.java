package Day9;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {30,40,20,60,10};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);  
		System.out.println(Arrays.toString(a)); //now the value changes which is a mutable property
		
		String m="Welcome";
		System.out.println(m);
		m.concat("to my house");
		System.out.println(m); // it won't be concatenated which is why is immutable
		//if u want to concat it. u should create a new string varaible
		String newVariable=m.concat("to my house");
		System.out.println(newVariable);
		
		
		
	}

}
