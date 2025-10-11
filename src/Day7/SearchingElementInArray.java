package Day7;

public class SearchingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50} ;
		int search_element= 40;//linear search
		boolean status= false;  //initially taking it as false
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==search_element) {
				System.out.println("Element found at "+i+"th place");
				status=true; //changing it to true if element is found
				break;
			}
		}
		if(status==false) {        //only if status remained false, then we execute element not found.
			System.out.println("Element not found");
		}
		
		//enhanced for loop
		for(int x:a) {     //a represents whole array, keeps giving value to x one after another and the cycle repeats
			if(x==search_element) {
				System.out.println("Element found");
				status= true;
				break;
			}
		}
		if(status==false) {
			System.out.println("Element not found");
		}
	}

}
