package Day11;

public class StudentMain {

    public static void main(String[] args){
    Student stu= new Student();
    
    //Ways to store data into variables
    //Using object reference variables
    stu.sid=101;
    stu.sname="kadambari";
    stu.sgrade='A';
    stu.printStudentData();

    //using method
    stu.printingStudentData(102,"Kavana",'B');

    //using constructor
    //u don't hav to explicitly call constructor, it will get called at the time of object creation
// Student stu1= new Student(103,"Anu",'A');


    }
    



}
