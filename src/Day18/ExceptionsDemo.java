package Day18;
import java.util.Scanner;
public class ExceptionsDemo {

    public static void main(String[] args) { 
    
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter a number:");
       int num= sc.nextInt();
       int result = 100/num; // if u enter number 0, it will throw ArithmeticException: / by zero
         System.out.println("Result: " + result);

         //scenario 2:
         int arr[]= new int[5];
         System.out.println("Enter the position(0-4)");  //here, if u enter a value greater than 4, it will throw ArrayIndexOutOfBoundsException
         int pos= sc.nextInt();

         System.out.println("Enter the value:");
         int value = sc.nextInt();

         arr[pos]=value;
         System.out.println(arr[pos]);

         //scenario3
         String word="welcome";
         int k= Integer.parseInt(word); // this will throw NumberFormatException as "welcome" cannot be converted to integer
         System.out.println(k);

         //scenario 4
         String str=null;
            System.out.println(str.length()); // this will throw NullPointerException as we are trying to access length of null string

    }

}
