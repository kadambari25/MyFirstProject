package Day15;

class Animal{
    String color="white";
    void eat(){
        System.out.println("Eating...");
    }
}

class Dog extends  Animal{
    String color="black";

    void printColors(){
        System.out.println(color);          //prints color of Dog class
        System.out.println(super.color);    //prints color of Animal class using super keyword
    }
     void eat(){
        super.eat();                        //calls eat() method of Animal class using super keyword
        System.out.println("Dog is eating...");
}
public class SuperKeyword {
    public static void main(String[] args) {
        Dog dog= new Dog();
        dog.printColors();    //super keyword is user to print the value of parent class when both parent and child class have same variable name.
        dog.eat();           //super keyword is used to call the method of parent class when both parent and child class have same method name.
    }

}
}
// in multilevel inheritance, super keyword can be used to access the members of immediate parent class only.