package Day7;

import java.util.Arrays;

public class SortingStringsAndChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[]= {'S','E','H','K'};
		String s[]= {"kadu","kavi","anuj","ashvik"};
		Arrays.sort(c);    //this sort is only used for ascending order. this is a built in method for sort.
		Arrays.sort(s);
		System.out.println("After sorting: "+Arrays.toString(c));
		System.out.println("After sorting: "+Arrays.toString(s));
	}

}
