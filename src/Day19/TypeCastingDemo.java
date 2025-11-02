package Day19;

public class TypeCastingDemo {

    public static void main(String[] args) {
        //upcasting:converting the lower data type to higher data type. this is done automatically by java compiler.
        int a=20;
        float f=a;
        System.out.println(f);

        //downcasting: converting higher data type to lower data type. this is done manually by programmer.
        double d=30.5;
        float floatvalue= (float)d;  //need to cast it manually by adding (float) before d.
        System.out.println(f);

        long l=1000000;
        int intvalue=(int)l;        //need to cast it manually by adding (int) before l.
        System.out.println(intvalue);

        //consider a small and a large container. you cantransfer water from small container to large container without any effort. but to transfer water from large container to small container, you have to be careful and do it manually to avoid spilling of water.thats why u have to cast it manually which is nothing but adding (int), (float) etc.

        double doublevalue= 45.67;
        int int1= (int)doublevalue; //while downcasting, there may be loss of data. here decimal part will be lost.
        System.out.println(int1);   //prints 45
        
    }
}
