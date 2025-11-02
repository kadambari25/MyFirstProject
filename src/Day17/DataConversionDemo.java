package Day17;
//wrapper classes are built-in classes in Java that provide a way to use primitive data types (int, char, boolean, etc.) as objects. Each primitive data type has a corresponding wrapper class in the java.lang package.
//Wrapper classes are useful when you need to work with collections (like ArrayList, HashMap, etc.) that can only store objects, not primitive types. They also provide utility methods for converting between types and for performing operations on the values they wrap.

public class DataConversionDemo {
//String->int conversion
    String s= "welcome"; //cannot convert this to int directly

    String k="100";   //need to conevrt this to int if u wanna add else it will concatenate.forthat we will use wrapper classes.
    String l="200";
//if u want to add these
String m= k+l; //this will concatenate and give 100200
//So we use wrapper classes to convert string to int in this case. Wrapper classes are used to convert primitive data types to objects and vice versa.
//each primitive data type has a corresponding wrapper class
//byte -> Byte
//short -> Short
//int -> Integer
//long -> Long
//float -> Float
//double -> Double
//char -> Character
//boolean -> Boolean
//Here we will use Integer wrapper class to convert string to int
//But string to char cannot be converted using wrapper class.Because string can have multiple characters but char can have only one character.
    int kint=Integer.parseInt(k);
    int lint=Integer.parseInt(l);
    int sum=kint+lint;

    //String->double conversion
    String d="10.5";
    double dnew = Double.parseDouble(d); //converts string to double

    //String-> boolean conversion
    String b="true";
    boolean bnew= Boolean.parseBoolean(b); //converts string to boolean
    String b2="false";
    boolean bnew2= Boolean.parseBoolean(b2); //converts string to boolean
    String b3="selenium";
    boolean bnew3= Boolean.parseBoolean(b3);  //returns false because string is not "true". the string u are trying to convert should be "true" or "false".
    //if u pass any other string other than "true" (case insensitive), it will return false.

    public static void main(String[] args) {
        DataConversionDemo obj= new DataConversionDemo();
        System.out.println("The sum of "+obj.kint+" and "+obj.lint+" is: "+obj.sum);
        System.out.println(obj.dnew);
        System.out.println(obj.bnew);

        //scenario 2: conevrting int,float,double,boolean and character to string
        int num1=10;
        float num2=10.5f;
        double num3=20.5;
        boolean bool1=true;
        char ch='A';

        String str1=String.valueOf(num1); //converts int to string
        String str2=String.valueOf(num2); //converts float to string
        String str3=String.valueOf(num3); //converts double to string
        String str4=String.valueOf(bool1); //converts boolean to string
        String str5=String.valueOf(ch); //converts char to string . so that string hold one character inside " ".

        System.out.println("The coneverted string values are: "+str1+", "+str2+", "+str3+", "+str4+", "+str5);

    }

}

//For non primitive data types, like string, we can directly create object.
//Example
//String k= "Hello"; //variable creation
//String str= new String("hello"); //object creation using new keyword.
//But this is not applicable for primitive data types like int, char, boolean etc.
//For primitive data types, we can use wrapper classes to create objects.
//Example
//int a=10; //variable creation
//Integer obj= new Integer(10); //object creation using wrapper class. (deprecated way)
//But the above way of creating object using wrapper class is deprecated. The recommended way is to use valueOf() method of wrapper class.
//Example       
//Integer obj= Integer.valueOf(10); //object creation using valueOf() method of wrapper class.
//Similarly, we can use parseInt() method of Integer wrapper class to convert string to int as shown above.
