package Day12;

public class Adder {
    int a=20, b=30;

    void sum(){
        System.out.println(a+b);
    }

    void sum(int x, int y){                     //adding params
        System.out.println(x+y);
    }

    void sum(int x, double y){                  //different type of params
        System.out.println(x+y);
    }

    void sum(double x, int y){                  //changing order of params
        System.out.println(x+y);
    }

    void sum(int x, int y, int z){              //adding diff no. of params
        System.out.println(x+y+z);
    }


}
