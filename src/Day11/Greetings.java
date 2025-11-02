package Day11;

public class Greetings {

    //No parameters, No return value
    void m1(){
        System.out.println("Hello World");        //void because we are not returning any value
    }

    //No params, return value
    String m2(){                                  // String because return type is a string value
        return "I am saying hello world";
    }

    //Takes params. no return value
    void m3(String name){
        System.out.println("My name is "+name);
    }

    //Takes params. returns value
    String m4(String name){
        return("My name is "+name);
    }

}
