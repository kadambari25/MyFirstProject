package Day12;

public class OverloadingMainMethod {
   
     void main(int x, int y){
        System.out.println(x+y);
    }

     void main(String name){
        System.out.println("My name is "+name);
    }

    void main(int x, double y){
        System.out.println(x+y);
    }
    public static void main(String[] args) {     //String args is also a parameter of type String array in the main method. so u can overload that with other main methods with diff parameters.
                                                //args is a reference variable which is pointing to the array of String type.you can give any name to that variable.
        OverloadingMainMethod ov= new OverloadingMainMethod();
        ov.main(10,20);
        ov.main("John");
        ov.main(10,20.4);
    }

}
