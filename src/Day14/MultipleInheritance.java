package Day14;
//multiple Inheritance is not directly supported in Java through classes to avoid complexity and ambiguity that can arise from it. However, Java provides a way to achieve multiple inheritance through interfaces. An interface in Java is a reference type that can contain only constants, method signatures, default methods, static methods, and nested types. Interfaces cannot contain instance fields or constructors.
//because when two parent classes are there for a single child class, and we create object of a child class, now if both parent class have same methods, then which method will be inherited by child class is ambiguous and it creates complexity. To avoid this complexity, Java does not support multiple inheritance through classes but supports it through interfaces as interfaces do not have method implementations, so there is no ambiguity.
//even if we dont have methods by same name in both parent classes, still there will be duplicate methods and variables in the parent classes because parent class always extends Object class implicitly and Object class has many methods. So when two parent classes are there for a single child class, both parent classes will have duplicate methods inherited from Object class which creates complexity and ambiguity. To avoid this, Java does not support multiple inheritance through classes but supports it through interfaces as interfaces do not extend Object class, so there is no ambiguity.

class Agam{
    
}

class Barghavi{
    
}
public class MultipleInheritance {
    Agam ObjA= new Agam();
    Barghavi ObjB= new Barghavi();

  //  objA.
  //  ObjB.
    //SO if u try to access somethig from the objects of class A and B which actually doesn't have anything. try keeping a dot after object name, you can see options for multiple methods and variables inherited from Object class.
//when a class is created in Java, it implicitly extends the Object class, which is the root class of the Java class hierarchy. This means that every class in Java, including class A and class B in this case, automatically inherits methods from the Object class, such as toString(), equals(), hashCode(), and others. Therefore, even though class A and class B do not explicitly define any methods or variables, they still have access to the methods inherited from the Object class.
}
