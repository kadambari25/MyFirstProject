package Day18;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        String str = null;
        int arr[] = new int[5];
        try {
            // This block may throw multiple exceptions
            System.out.println("Length of the string: " + str.length()); // May throw NullPointerException
            arr[10] = 50; // May throw ArrayIndexOutOfBoundsException
            int result = 100 / 0; // May throw ArithmeticException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: String is null.");
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: Invalid array index.");
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: Division by zero.");
            System.out.println(e.getMessage());

        } catch (Exception e) { // Generic catch block to handle any other exceptions
            System.out.println("Caught an unexpected exception: " + e.getMessage());
            System.out.println(e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }

}

//you can have multiple catch blocks to handle one exception, whicheveris suitable will be executed. if none matches, then the generic exception catch block will be executed.
//instead you can have one catch block that handles Exception class, but it is not a good practice as you will not be able to handle specific exceptions differently.