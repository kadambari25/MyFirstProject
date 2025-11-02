package Day12;
//Constructor overloading
public class Box {

    double height, width, length;

    Box(){                              //default constructor, no params
        height=0;
        width=0;
        length=0;
    }

    Box(double h, double w, double l){   //params added
        height=h;
        width=w;
        length=l;
    }

    Box(double d){                        //no of params are diff, taking only one param here
        height=width=length=d;
    }

    double volume(){
        return (height*width*length);


        //Constructor are used for assigning value for variables. so if u want to perform an operation, u need to create a separate method.
    }

}
