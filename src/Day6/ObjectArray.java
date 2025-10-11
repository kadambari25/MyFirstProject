package Day6;

public class ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object s[]= {2,"from",false,2.5,5678900};
		//arrays only store homogeneous data, but using object type array we can store heterogeneous data
		
		//reading data
		for(Object x:s) {
			System.out.println(x);  //here x is also object type because that way it can take all the heterogeneous data passed into it
		}
		
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		
		//object is the predefined class, it is like any other data type like int, float and all.
		//object is the root from where all other data types are derived.

}
}