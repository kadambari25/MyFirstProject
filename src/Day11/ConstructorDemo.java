package Day11;

public class ConstructorDemo {

    int x,y;

    ConstructorDemo(){     //default constructor
      x=100;
      y=200;  
    }

    ConstructorDemo(int a, int b){    //parameterized constructor
        x=a;
        y=b;
    }
    
    void sum(){
    System.out.println(x+y);
    }

     public static void main(String[] args){
       ConstructorDemo cons=new ConstructorDemo();  //with this default constructor gets called
        cons.sum(); 
        

        ConstructorDemo cons1= new ConstructorDemo(10,20);   //with this parameterized constructor gets called
        cons1.sum();

        //u can hav many constructors with diff parameters.


    }



}
