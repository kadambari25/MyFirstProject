package Day15;

final class Ultimate{                                    //final class: this class cannot be inherited by any other class. this is useful when u want to prevent further derivation of a class.
    void show(){                                                            //another class cannot extend this class.
        System.out.println("This is a final class.");
    }
}
class ABC{
    final void display(){        //final method: when a method is declared as final, it cannot be overridden by subclasses. this is useful when u want to prevent modification of a method's behavior in derived classes.
        System.out.println("This is a final method.");
    }

    void show(){
        System.out.println("This is a non final method.");
    }
}

class LMN extends ABC{
   // void display(){           //throws error because final method cannot be overridden.
    //    System.out.println("Trying to override final method.");
   // }

    void show(){               //this is allowed as show() is not final method.
        System.out.println("Overriding non final method.");
    }
}
public class FinalKeywordForMethods {
    public static void main(String[] args) {
        
    }

}
