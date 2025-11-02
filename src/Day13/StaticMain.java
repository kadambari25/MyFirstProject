package Day13;

public class StaticMain {
    public static void main(String[] args) {
        //accessing static variables and methods by specifying class name because we are trying to access them from another class.
        System.out.println(StaticDemo.a);
        StaticDemo.display();

        StaticDemo st= new StaticDemo();
        System.out.println(st.a);
        st.b=20;
        System.out.println(st.c);
        st.display1();

        st.m2();  //calling non static method inside static method by creating object of the class.

    }

}
