package Day6;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaring an array
		
		int a[]= new int[5]; //declaring an array
		a[0]=100;            //adding values to an array
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500; //use this approach when u know how many values u want to store, so that as many memory allocations will be created.
		
		//approach2
		int k[]= {100,200,300,400,500}; //use this when u dont know how many values u want to store, so that u can add more values later
		//example: int k[]={100,200,300,400,500,600};
		
		//you can access array by indexes, index always starts from 0.
		
		//Finding length of an array
		System.out.println(k.length);
		
		//reading single value from the array
		System.out.println(k[3]);
		
		//suppose we don't know the array length, and we want to read all values of array
		//Approach 1 : for loop
		for(int i=0;i<k.length;i++) {      //i<k.length, i<=k.length-1
			System.out.println(k[i]);
		}
		
		//using advanced for loop or for each loop
		for(int x:k) {
		System.out.println(x);	
		}
		
	}

}
