package Day15;
class ABCD{
    void m1(int a){
        System.out.println(a);
    }

    void m2(int b){
        System.out.println(b);
    }

}

class XYZ extends ABCD{
    void m1(int a, int b){      //METHOD OVERLOADING: when a class inherits another class and has a method with same name but different parameters, it is called method overloading.
        System.out.println(a+b); //method overloading can happen within same class or in child class.
    }

    void m2(int b){             //METHOD OVERRIDING: when a child class has a method with same name and same parameters as in its parent class but different implementation, it is called method overriding.
        System.out.println(b*b); //even return type should be same.only implementation changes.
    }
    //here from class ABC and XYZ, totally 3 methods are there because overridden method is also considered as a single method.because there is no change in method declaration.(name and parameters are same).
//you will understand when u try to access these methods using object of class XYZ.
 void m2(int c, int d){
    System.out.println(c*d); //u can override and overload the same method.
 }
   
}
public class MethodOverloadingVsOverriding {
    public static void main(String[] args) {
        
    
    ABCD abcobj= new ABCD();
    abcobj.m1(10);  //accessing method of class ABC
    abcobj.m2(5);   //accessing method of class ABC
    XYZ xyzobj= new XYZ();
    xyzobj.m1(10,20); //accessing overloaded method of class XYZ
    xyzobj.m2(5);     //accessing overridden method of class XYZ
    xyzobj.m2(4,5);
    
    }
}
