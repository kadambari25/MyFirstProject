package Day16;
//showing multiple inheritance using interfaces: where a class is implementing more than one interface, multiple parents, one child.
public class C1 extends C2 implements I1,I2 {    //we can extend one class at a time but can implement multiple interfaces.
    //this is also called as hybrid inheritance: where a class is inheriting from a class and implementing interfaces. if only interfaces are implemented, then it is called multiple inheritance.
    public void show(){    //make sure to declare public while implementing interface methods, otherwise it will be default and will throw error
        System.out.println("Implementation of show() method from I1 interface");
    }

    public void display(){
        System.out.println("Implementation of display() method from I2 interface");
    }


    public static void main(String[] args) {
        C1 obj= new C1();
        obj.show();
        obj.display();
        System.out.println("Value of X from I1 interface: "+I1.X);
        System.out.println("Value of y from I2 interface: "+I2.y);
        obj.print();  //accessing method from class C2 which is parent class of C1
    }

}
