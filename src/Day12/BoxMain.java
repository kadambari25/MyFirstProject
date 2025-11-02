package Day12;

public class BoxMain {

    public static void main(String[] args) {
        Box b = new Box();   //default constructor will be called
      System.out.println(b.volume());

      Box b1= new Box(11.5,12.5,13.5);  //parameterized constructor will be called
      b1.volume();
      System.out.println(b1.volume());

      Box b2= new Box(10.5);           //parameterized constructor with single parameter will be called
     System.out.println(b2.volume()); 

     
}
}
