package Day7;

public class FindHowManyDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[]= {100,200,300,100,500,600,100};
		int num=100;
		int count=0;
		
		for(int value:b) {
			if(value==num) {
				count++;
			}      					//if u write sysout after if, it will print the current count. hence check all values in array and then print
		}
		System.out.println(count);
		

}
}
