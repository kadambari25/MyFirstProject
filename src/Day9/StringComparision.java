package Day9;

public class StringComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hanuman";
		String s2="Hanuman";
		System.out.println(s1==s2); //true
		System.out.println(s1.equals(s2)); //true
		
	//approach 2:
		String s3="Raghavendra";
		String s4=new String("Raghavendra");
		System.out.println(s3==s4); //false, because == compares the objects as s3 and s4 are pointing out to different objects but contain same value
		System.out.println(s3.equals(s4)); //true as .equals compares only values
		
		//Object will be created when we used the new keyword
		
		//case3:
		String s5="Multiplication";
		String s6= new String("Multiplication");
		String s7=s6;
		System.out.println(s5==s6); //false, bec different objects
		System.out.println(s5.equals(s6)); //true, bec values are same
		
		System.out.println(s6==s7); //true, bec objects are same.
		System.out.println(s6.equals(s7)); //true bec as objects are same, value will be same as well
		
		System.out.println(s5==s7); //false, diff objects
		System.out.println(s5.equals(s7)); //true, values are same
	}

}
