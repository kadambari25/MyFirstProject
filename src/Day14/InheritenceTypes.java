package Day14;
//Single Level Inheritance: where a class inherits another class directly.The class that is inherited is called the parent class (or superclass), and the class that inherits is called the child class (or subclass).
class A{
    int a=10;
    void display(){
        System.out.println(a);
    }
}

class B extends A{
    int b=20;
    int d;
    void show(){
        System.out.println(b);
    }

}
//multilevel Inheritance: where a class inherits from a class that is already a subclass of another class. In this case, there is a chain of inheritance involving three or more classes.
class C extends B{
    int c;
    void print(){
        System.out.println(c);
    }
}

public class InheritenceTypes {      // One file can have multiple classes but only one public class.
    public static void main(String[] args) {
        B objb= new B();
        System.out.println(objb.a);      //Object created for class B can inherit all the methods and variables of class A and class B as B is child class of A or B has inherited all methods and variables of A.
        objb.display();
        System.out.println(objb.b);
        objb.show();

        A obja= new A();
        System.out.println(obja.a);         //whereas object created for class A can access only methods and variables of class A.
        obja.display();

        C objc= new C();
        objc.d=40;
        System.out.println(objc.a);      //Object created for class C can inherit all the methods and variables of class A, class B and class C as C is child class of B and B is child class of A or C has inherited all methods and variables of A and B.
        objc.display(); 
        System.out.println(objc.b);         //B already has all the methods and variables of A so C can access methods and variables of B as well which includes methods and variables of A.
        objc.show();
        System.out.println(objc.d);
        objc.c=50;
        System.out.println(objc.c);
    }

}
