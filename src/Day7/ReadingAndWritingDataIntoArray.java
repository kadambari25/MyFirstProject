package Day7;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingAndWritingDataIntoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int a[]=new int[5];   //declaring an array with 5 elements
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter a value for the position "+i);
			a[i]=sc.nextInt();
		}
		
		System.out.println("The array is "+Arrays.toString(a));
		
	}

}
