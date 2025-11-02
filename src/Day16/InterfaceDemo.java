package Day16;

interface shape{
    int length=10;   //by default variables in interface are public, static and final
    int breadth=20;  //by default variables in interface are public, static and final
    void circle();  //abstract method: in interface by default all methods are public . interface methods are abstract in nature

    default void rectangle(){  //default method  : interface also allows us to write default method with the help of default keyword
        System.out.println("This is a default method in interface");
    }

    static void square(){   //static method
        System.out.println("This is a static method in interface");
    }
}
public class InterfaceDemo implements shape{            //now all the variables and methods of interface shape can be accessed in this class
    public void circle(){   //implementation of abstract method, you have to specify public keyword because in a class, by default the methods will be default methods. But in interface it was a public abstract method. so if we dont make it public here, it will throw error
        System.out.println("Circle method implementation");
    }
        void triangle(){  //normal method in class
            System.out.println("This is a normal method in class");
    }
    

    public static void main(String[] args) {
        //scenario 1: accessing interface members using class object
        InterfaceDemo obj= new InterfaceDemo();
        obj.circle();          //accessing implemented abstract method  
        obj.rectangle();       //accessing default method
        shape.square();        //accessing static method of interface using interface name. because static methods can be accessed without creating object and it belongs to the interface class itself.
// when we are trying to access a static varaible or a method of a class in main method, if we are accessing it from different class, we access it using class name before the variable or method name.
        //similarly here, shape is the interface name and we are accessing its static method square() using interface name.

        //scenario 2: accessing interface members using interface reference variable
        shape obj2= new InterfaceDemo();  //new interfaceDemo() is creating object for the class interfaceDemo which is implementing the interface shape. so we can use interface reference variable to refer to the object of implementing class.
        obj2.circle();       //accessing implemented abstract method using interface reference variable         
        obj2.rectangle();    //accessing default method using interface reference variable
        shape.square();      //accessing static method of interface using interface name
      //  obj2.triangle(); //is not possible because triangle() is a normal method of class InterfaceDemo and we are trying to access it using interface reference variable. so it will throw error.

        
    }

}
