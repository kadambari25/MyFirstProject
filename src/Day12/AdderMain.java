package Day12;

public class AdderMain {
    public static void main(String[] args) {
        Adder add= new Adder();
        add.sum();
        add.sum(10,20);
        add.sum(10,30.5);
        add.sum(20.5, 4);
        add.sum(10,20,30);
    //    add.sum(10.5,10.3,14.0);   throws error as there is no method where we are passing such params
    //once u write object and give dot it will show all the methods it can acccess along with its params. just for ur ref
    //object is created for adder class, so that object can access everything is adder class
    }

}
