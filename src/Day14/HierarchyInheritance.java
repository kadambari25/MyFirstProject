package Day14;
//hierarchy inheritance is where multiple classes inherit from a single parent class.

class Parent{
    int x=100;
    void display(int a){
        System.out.println(a);
    }
}
class Child1 extends Parent{      //Child1 class inherits Parent class and all the methods and variables of Parent class and its own methods and variables.
    int y=200;
    void show(int b){
        System.out.println(b);
    }
}

class Child2 extends Parent{     //child2 class inherits Parent class and all the methods and variables of Parent class and its own methods and variables.
    int z=300;
    void print(int c){
        System.out.println(c);
    }
}

public class HierarchyInheritance {
    public static void main(String[] args) {
        Child1 ch1= new Child1();
        System.out.println(ch1.x);      //object of child1 class can access methods and variables of parent class as well as its own methods and variables.
        ch1.display(500);
        System.out.println(ch1.y);
        ch1.show(600);

        Child2 ch2= new Child2();
        System.out.println(ch2.x);      //object of child2 class can access methods and variables of parent class as well as its own methods and variables.
        ch2.display(700);
        System.out.println(ch2.z);
        ch2.print(800);
    }


}
