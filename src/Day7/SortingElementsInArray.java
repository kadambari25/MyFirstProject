package Day7;

import java.util.Arrays;

public class SortingElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {40,70,10,60,30,20};
		
		System.out.println("Before sorting...");
		System.out.println(Arrays.toString(a));  // to string method helps u print the array as it is, without using any loop
		
		Arrays.sort(a);					//this is a sorting method in arrays, sorts the array
		
		System.out.println("After sorting...");
		System.out.println(Arrays.toString(a));    //again using to string method to print the array after sort
		
	}

}
