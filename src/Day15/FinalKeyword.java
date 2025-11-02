package Day15;
//final keyword is used to declare constants. once a variable is declared as final, its value cannot be changed.


public class FinalKeyword {
    int a=20;
    final int b=30;


    public static void main(String[] args) {
       FinalKeyword fn= new FinalKeyword();
       fn.a=30;
       System.out.println(fn.a);
      // fn.b=40; //throws error because final variable value cannot be changed.
         System.out.println(fn.b);

    }

}
