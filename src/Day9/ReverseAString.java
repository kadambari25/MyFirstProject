package Day9;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcome";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
			
		}
		System.out.println(rev);
		
		//approach2: convert to character type array and do it.. without using string methods like charAt
		
		String z="morning";
		String reverse="";
		
		char a[]= z.toCharArray(); //now array a has all the values of z {m,o,r,n,i,n,g}
		
		for(int i=a.length-1;i>=0;i--) {
			reverse+=a[i];
		}
		System.out.println("The reversed string is "+reverse);
		
		//Approach3: using StringBuffer class
		StringBuffer j= new StringBuffer("Sunflower");
		System.out.println(j.reverse());
		
		//Approach4: Using StringBuilder class
		StringBuilder m= new StringBuilder("Cockroach");
		System.out.println(m.reverse());
		
		//we need to use these classes because, for string we can't use reverse method.
		
	}

}
