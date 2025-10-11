package Day6;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaring an array
		int a[][]=new int[3][2];
		//int [][]=new int[][]; //all are correct ways
		//it says 3 rows and 2 columns.
		
		//assigning value to array
		a[0][0]=100;
		a[0][1]=200;  //refer word for the image
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		
		//approach2
	//	int k[][]= { {100,200}, {300,400}, {500,600} };
		int k[][]= { {100,200},
				     {300,400}, 
				     {500,600} };  //each row will come in each curly brace, if u want to add another column, u are free to add

		//finding size of the array
		System.out.println("Number of rows"+a.length); //bec in single d, we just use. length and it has only rows, same applies here
		System.out.println("Number of columns"+a[0].length); //this will give u the no. of columns in particular row.
		
		//reading single value from an array
		System.out.println(k[1][1]);
		
		//Reading all the values from the array
		
		for(int r=0;r<k.length;r++) {  //for row, k.length gives no. of rows
			for(int c=0;c<k[r].length;c++) {   // for column, we are passing r inside coz it will giv the length of column of particular row we are in 
				System.out.println(k[r][c]);  
		
				
		
			}
		}
		
		

//here, first it is 0,0. next c gets incremented, checks the condition of c then it will be 0,1.		
		//next again c gets incremented, checks condition condition fails, and control comes out of inner foor loop.
		//next, r gets incremented, checks the condition of r. now it is 1,0, again c gets incremented, now it is 1,1.
		//and the loop gets repeated.
				
		//here, for one iteration of outer for loop, inner foor loop repeats twice.

//If you want to print it in terms of rows and colums

/* for(int r=0;r<k.length;r++) {
	for(int c=0;c<k[r].length;c++) {
		System.out.print(k[r][c]+ " ");  // this prints a line 
	}
	System.out.println(); //this is just to giv enter or to go to next line
} */
		
		//enhanced foor loop
		for(int arr[]:k) {  
			for(int x: arr) {    
			}
			System.out.println();
		}

	}

}
//Basically, k is representing the entire array, but when it gives value to arr variable it gives first row, bec arr is a single dimesnsional variable which can hold only row .
//then when arr variable is passing value to int x , it gives first value of row because int can hold one value at a time and in the end that gets printed. And then the second value of row is printed . and then whole process repeats.

