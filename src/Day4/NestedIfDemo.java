package Day4;

public class NestedIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(true) { //try for false as well both inside and out
			if(true) {
				System.out.println("abc");
			}else {
				System.out.println("xyz");
			}
		} else {
			System.out.println("lmn");
		}

	}

}
