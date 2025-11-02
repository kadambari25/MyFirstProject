package Day13;

public class ThisKeyword {

    int x, y;  //class variables

    ThisKeyword(int x, int y )
    {
        this.x=x;    //this keyword is used to differentiate between class variables and local variables when they have same name.
        this.y=y;    // this represents class varaiables.
    }
    void sum(){
        System.out.println(x+y);
    }

    void setData(int x, int y){     //this keyword is also applicable while using setter methods.
        this.x=x;    //this keyword is used to differentiate between class variables and local variables when they have same name.
        this.y=y;
    }

    void display(){
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        ThisKeyword th= new ThisKeyword(5, 4);
        th.sum(); 
        th.setData(20,30);
        th.display();
    }



}
