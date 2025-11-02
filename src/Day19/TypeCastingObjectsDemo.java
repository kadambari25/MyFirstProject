package Day19;



    class parent{
        int id=101;

        void m1(){
            System.out.println("Parent class method");
        }
    }

    class child extends parent{
        int age=25;

        void m2(){
            System.out.println("Child class method");
        }
    }
public class TypeCastingObjectsDemo {
    public static void main(String[] args) {
        parent p = new parent();
        child c= new child();
        //upcasting: child class object is being referred by parent class reference variable. this is done automatically by java compiler.
        parent p1= c;  //upcasting  
        System.out.println("Value of id from parent class using upcasted object: "+p1.id);
        p1.m1();
        //p1.m2();  //throws error as m2() is not present in parent class.

        //downcasting: parent class object is being referred by child class reference variable. this is done manually by programmer.
        parent p2= new parent();
        child c1= (child)p2;  //downcasting
        System.out.println("Value of id from parent class using downcasted object: "+c1.id);
        c1.m1();
        //c1.m2();  //throws error at runtime as m2() is not present in parent class.

        //so in this case, whether upcasting or downcasting, only the members of parent class will be accessible as the actual object is of parent class.

        
    }

}
