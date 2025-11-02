package Day18;
import java.util.Scanner;

public class ExceptionsHandling {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        try{                                               //Exception might occur here as user may enter 0.so we add the code that causes exception inside try block
        int result = 100/num;
        }catch(ArithmeticException e){                      //you will catch the exception using catch block. here we are catching ArithmeticException
            System.out.println("Cannot divide by zero.");  //exception handling will be done inside the catch block.
        }


        
    }

}
