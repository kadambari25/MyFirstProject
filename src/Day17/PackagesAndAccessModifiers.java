package Day17;

public class PackagesAndAccessModifiers {

    // packages are the next level after projects in Java. A package is a namespace that organizes a set of related classes and interfaces. Conceptually, you can think of packages as being similar to different folders on your computer. Just as you might keep related files together in the same folder, you can group related classes and interfaces into the same package.
    // Packages help to avoid name conflicts and to control access to classes, interfaces, and methods. They also make it easier to locate and use the classes, interfaces, and methods that are relevant to your application.
    // Two types of packages:
    // 1. Built-in packages: these are the packages that come with the Java Development Kit (JDK). Examples include java.lang, java.util, java.io, java.net, etc.
    // Here java is the top-level package, lang, util, io, net are sub-packages.
    // util.array is a sub-package of util package.
    // 2. User-defined packages: these are the packages that you create to organize your own classes and interfaces. You can create a package by using the package keyword followed by the package name at the top of your Java source file.
    //basically all packages u created in this project are user-defined packages.

    //you can have a package inside a package. this is called sub-package. for example, java.util is a sub-package of java package.

    // Access Modifiers in Java:
    // Access modifiers are keywords in Java that determine the visibility and accessibility of classes, methods, and variables. There are four access modifiers in Java:
    // 1. Public: when a class, method, or variable is declared as public, it can be accessed from any other class or package. BASICALLY ANYWHERE IN THE PROJECT.
    // 2. Private: when a class, method, or variable is declared as private, it can only be accessed within the same class.
    // 3. Protected: when a class, method, or variable is declared as protected, it can be accessed within the same package. and also by subclasses in other packages, It can be accessed using inheritance where a class in  another package extends the class with protected members.
    // 4. Default (no modifier): when no access modifier is specified, it is considered as default. In this case, the class, method, or variable can be accessed only within the same package.
}
