package Day18;

public class FinallyBlock {
    public static void main(String[] args) {
        //finally block is used to execute a block of code regardless of whether an exception is thrown or not. it is mainly used to close resources like database connections, file streams, etc.
        int[] arr = {1, 2, 3, 4, 5};
        try {
            System.out.println("Accessing element at index 10: " + arr[10]); // if we had provided right number, no exception would have occurred.even then finally block will execute.
        } catch (ArrayIndexOutOfBoundsException e) {                          //if it had numberformat exception, it would have been caught here. even then finally block will execute.
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed. This block runs regardless of whether an exception occurred or not.");
        }
        
    }

}
