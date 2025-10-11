package Day9;

public class StringBufferAndStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer l=new StringBuffer("hello");
		System.out.println(l);
		l.append("I am Kadambari");
		System.out.println(l);
		
		StringBuilder r=new StringBuilder("Hi");
		System.out.println(r);
		r.append("I am Hanuman"); //append is the method used in these classes for concatinating
		System.out.println(r);
		
		//hence these two classes are mutable compared to string.
	}

}
