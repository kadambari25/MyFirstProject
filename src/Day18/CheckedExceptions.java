package Day18;

import java.io.FileInputStream;

public class CheckedExceptions {
    public static void main(String[] args)  throws InterruptedException, java.io.FileNotFoundException {

        //Checked exceptions are exceptions that are checked at compile-time by the compiler. These exceptions must be either caught using a try-catch block or declared in the method signature using the throws keyword. Examples of checked exceptions include IOException, SQLException, and ClassNotFoundException.

        //Example of checked exception: File handling
        /*
        import java.io.File;
        import java.io.FileReader;
        import java.io.IOException;

        public class CheckedExceptionExample {
            public static void main(String[] args) {
                try {
                    File file = new File("nonexistentfile.txt");
                    FileReader fr = new FileReader(file); // This line may throw IOException
                } catch (IOException e) {
                    System.out.println("File not found: " + e.getMessage());
                }
            }
        }
        */

        //In this example, if the file "nonexistentfile.txt" does not exist, a FileNotFoundException (which is a subclass of IOException) will be thrown. Since IOException is a checked exception, we must handle it using a try-catch block.
        System.out.println("Checked exceptions must be handled at compile-time.");
        System.out.println("Examples include IOException, SQLException, etc.");
        try{
        Thread.sleep(5000);  ////throws InterruptedException, so lets handle it
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }

        FileInputStream file = new FileInputStream("c:\\file.txt"); //this line throws FileNotFoundException, which is a checked exception, so we must handle it.
        //handling this using throws keyword in method signature. 
        //so for, checked exceptions java will only tell us that the exception might occur, and we can handle it either by try-catch or throws keyword.
    }

}
