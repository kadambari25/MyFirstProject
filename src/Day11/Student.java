package Day11;

public class Student {
    int sid;                //class variables
    String sname;
    char sgrade;

    void printStudentData(){
        System.out.println("Student id: "+sid+" Student name: "+sname+" Student grade: "+sgrade);
    }

    void printingStudentData(int id, String name, char grade){          //local variables
        sid=id;
        sname=name;
        sgrade=grade;
        System.out.println("Student id: "+sid+" Student name: "+sname+" Student grade: "+sgrade);

    }

    //Constructor
   /*  Student(int id,String name, char grade){
        sid=id;
        sname=name;
        sgrade=grade;

    } */

}
