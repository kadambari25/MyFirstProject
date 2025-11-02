package Day13;

public class StaticDemo {
    static int a=10;
     int b;
     int c= 30;

    static void display(){
        System.out.println("Heyy");
     }

     void display1(){
        System.out.println("Hello");
     }
     //Non static methods can access both static and non static variables and methods.
     void m2(){
        System.out.println(a);
        b=30;
        System.out.println(c);
        display();
        display1();
     }
    public static void main(String[] args) {
        //you can access static Variables and methods directly inside static method (main method is static method) without creating object of the class.
        System.out.println(a);
        display();

        //to access non static variables and methods inside static method, u need to create object of the class.
        StaticDemo st= new StaticDemo();
        st.b=20;
        System.out.println(st.c);
        st.display1();

        st.m2();  //calling non static method inside static method by creating object of the class.

    }
}
